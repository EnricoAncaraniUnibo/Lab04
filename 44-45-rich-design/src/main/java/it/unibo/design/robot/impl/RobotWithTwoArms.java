package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

/**
 * RobotWithTwoArms
 */
public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{

    private final BasicArm ba1;
    private final BasicArm ba2;
    private int items;

    public RobotWithTwoArms(final String name) {
        super(name);
        ba1 = new BasicArm("1");
        ba2 = new BasicArm("2");
        items = 0;
    }

    @Override
    public boolean pickUp() {
        if(items == 2) {
            return false;
        }
        if(ba1.isGrabbing()) 
        {
            ba2.pickUp();
            items++;
            return true;
        } else {
            ba1.pickUp();
            items++;
            return true;
        }
    }

    @Override
    public boolean dropDown() {
        if(items == 0) {
            return false;
        } 
        if(ba1.isGrabbing()) {
            ba1.dropDown();
            items--;
            return true;
        } else {
            ba2.dropDown();
            items--;
            return true;
        }
    }

    @Override
    public int getCarriedItemsCount() {
        return this.items;
    }

    
}