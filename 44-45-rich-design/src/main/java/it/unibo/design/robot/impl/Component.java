package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.ComposableRobot;
import it.unibo.design.robot.api.RobotPart;

public abstract class Component implements RobotPart{
    private boolean status;
    private ComposableRobot robot;

    public Component() {
        status = false;
        robot = null;
    }

    @Override
    public boolean isActive() {
        return status;
    }

    @Override
    public void turnOn() {
        if(robot != null) {
            status = true;
        }
    }

    @Override
    public void turnOff() {
        status = false;
    }

    @Override
    public void connect(ComposableRobot robot) {
        this.robot = robot;
    }

    @Override
    public void disconnect() {
        this.robot = null;
        turnOff();
    }

    @Override
    public ComposableRobot getRobot() {
        return robot;
    }
}
