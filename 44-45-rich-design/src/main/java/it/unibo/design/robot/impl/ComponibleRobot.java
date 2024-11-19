package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.ComponibleRobotInterface;

public class ComponibleRobot extends BaseRobot implements ComponibleRobotInterface{
    private ComponentImp[] obj;
    private int lastPosition;

    public ComponibleRobot() {
        super("robot");
        obj = new ComponentImp[4];
        lastPosition = 0;
    }

    @Override
    public void allActivatedAtOnce() {
        for (ComponentImp object : obj) {
            object.use();
        }
    }

    @Override
    public Object[] getComponents() {
        return obj;
    }

    @Override
    public void addComponent(ComponentImp component) {
        if(lastPosition<4) {
            obj[lastPosition] = component;
            lastPosition++;
        }
    }
}
