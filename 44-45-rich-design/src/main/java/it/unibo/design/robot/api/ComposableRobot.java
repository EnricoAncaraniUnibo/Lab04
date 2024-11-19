package it.unibo.design.robot.api;

import java.util.*;

public interface ComposableRobot extends Robot{
    public void attachComponent(RobotPart part);

    public void detachComponent(RobotPart part);

    public List<RobotPart> getParts();

    public void useAll();
}
