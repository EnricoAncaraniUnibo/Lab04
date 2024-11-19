package it.unibo.design.robot.api;

public interface ComponibleRobotInterface extends RobotWithArms{
    void allActivated();

    Object[] getComponents();

    void addComponent(Component component);
}
