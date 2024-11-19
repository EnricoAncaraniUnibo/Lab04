package it.unibo.design.robot.impl;

import java.util.*;

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
    }

    @Override
    public void removePart(RobotPart part) {
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
}
