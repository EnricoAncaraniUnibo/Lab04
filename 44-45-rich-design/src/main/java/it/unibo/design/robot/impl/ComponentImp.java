package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Component;

public abstract class ComponentImp implements Component{
    private boolean active;
    private BaseRobot robot;
    private final static double BATTERY_CONSUMTION = 0.1;

    public ComponentImp() {
        this.active = false;
        robot = null;
    }

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
    public BaseRobot getRobot() {
        return robot;
    }

    @Override
    public void connectRobot(BaseRobot robot) {
        this.robot = robot;
    }

    @Override
    public void disconnectRobot() {
        this.robot = null;
        this.active = false;
    }

    @Override
    public double getBatteryConsumption() {
        return BATTERY_CONSUMTION;
    }

    public abstract void use();
}
