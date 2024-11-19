package it.unibo.design.robot.api;

public interface Component {
    boolean turnOn();

    boolean turnOff();

    boolean isActive();

    RobotComponibile getRobot();

    void connectRobot();

    void disconnectRobot();

    double getBatteryConsumption();
}
