package it.unibo.design.robot.api;

import java.util.*;

public interface ComposableRobot extends Robot{
    public void addPart(RobotPart part);

    public void removePart(RobotPart part);

    public List<RobotPart> getParts();

    public void useAll();
}
