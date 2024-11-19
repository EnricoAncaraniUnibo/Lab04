package it.unibo.design.robot.api;

import it.unibo.design.robot.impl.SimpleComposableRobot;

public interface RobotPart {
    public boolean isActive();

    public void turnOn();

    public void turnOff();

    public void connect(SimpleComposableRobot robot);

    public void disconnect();

    public void use();

    public SimpleComposableRobot getRobot();
}
