package it.unibo.design.robot.api;

public interface RobotComponibile extends RobotWithArms{
    void allActivated();

    Object[] getComponents();

    void addComponent(Component component);
}
