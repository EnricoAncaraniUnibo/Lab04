package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Component;
import it.unibo.design.robot.api.ComponibleRobotInterface;

public class ComponentImp implements Component{
    private boolean active;
    private ComponibleRobotInterface robot;
    private final static double BATTERY_CONSUMTION = 0.1;

    @Override
    public void turnOn() {
        if(robot!=null) {
            active = true;
        }
    }

    @Override
    public void turnOff() {
        active = false;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public ComponibleRobotInterface getRobot() {
        return robot;
    }

    @Override
    public void connectRobot(ComponibleRobotInterface robot) {
        this.robot = robot;
    }

    @Override
    public void disconnectRobot() {
        this.robot = null;
    }

    @Override
    public double getBatteryConsumption() {
        return BATTERY_CONSUMTION;
    }
    
}
