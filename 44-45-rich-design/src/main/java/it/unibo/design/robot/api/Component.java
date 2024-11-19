package it.unibo.design.robot.api;

public interface Component {
    void turnOn();

    void turnOff();

    boolean isActive();

    ComponibleRobotInterface getRobot();

    void connectRobot(ComponibleRobotInterface robot);

    void disconnectRobot();

    double getBatteryConsumption();
}
