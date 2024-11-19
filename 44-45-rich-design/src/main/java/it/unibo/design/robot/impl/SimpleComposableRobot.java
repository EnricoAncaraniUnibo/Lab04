package it.unibo.design.robot.impl;

import java.util.ArrayList;
import java.util.List;

import it.unibo.design.robot.api.ComposableRobot;
import it.unibo.design.robot.api.RobotPart;

public class SimpleComposableRobot extends BaseRobot implements ComposableRobot{
    private final List<RobotPart> components;
    
    public SimpleComposableRobot(String name) {
        super(name);
        components = new ArrayList<>();
    }

    @Override
    public void attachComponent(RobotPart part) {
        components.add(part);
        part.connect(this);
    }

    @Override
    public void detachComponent(RobotPart part) {
        part.disconnect();
        components.remove(part);
    }

    @Override
    public List<RobotPart> getParts() {
        return components;
    }

    @Override
    public void useAll() {
        for (RobotPart robotPart : components) {
            robotPart.use();
        }
    }

    @Override
    public void consume(final double amount) {
        super.consumeBattery(amount);
    }

    @Override
    protected double getBatteryRequirementForMovement() {
        double somma = 0;
        for (RobotPart robotPart : components) {
            if(robotPart instanceof RobotArm a) {
                somma = somma + a.getConsumptionForMoving();
            }
        }
        return somma;
    }
}
