package it.unibo.design.robot.api;

import java.util.List;

public interface ComposableRobot extends Robot{
    public void attachComponent(RobotPart part);

    public void detachComponent(RobotPart part);

    public List<RobotPart> getParts();

    public void useAll();

    public void consume(double amount);
}
