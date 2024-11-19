package it.unibo.design.robot.api;

public interface RobotPart {
    public boolean isActive();

    public void turnOn();

    public void turnOff();

    public void connect(ComposableRobot robot);

    public void disconnect();

    public void use();

    public void getEnergyConsumtion();
}
