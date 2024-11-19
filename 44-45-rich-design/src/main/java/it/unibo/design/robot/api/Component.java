package it.unibo.design.robot.api;

import it.unibo.design.robot.impl.BaseRobot;

public interface Component {
    void turnOn();

    void turnOff();

    boolean isActive();

    BaseRobot getRobot();

    void connectRobot(BaseRobot robot);

    void disconnectRobot();

    double getBatteryConsumption();
}
