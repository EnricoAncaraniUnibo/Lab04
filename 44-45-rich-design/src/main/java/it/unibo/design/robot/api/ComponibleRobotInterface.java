package it.unibo.design.robot.api;

import it.unibo.design.robot.impl.ComponentImp;

public interface ComponibleRobotInterface {
    void allActivatedAtOnce();

    Object[] getComponents();

    void addComponent(ComponentImp component);
}
