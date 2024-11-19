package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

/**
 * RobotWithTwoArms
 */
public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{

    private final BasicArm ba1;
    private final BasicArm ba2;
    private int items;
    private final static double TRANSPORT_OBJECT_CONSUMPTION=0.1;

    public RobotWithTwoArms(final String name) {
        super(name);
        ba1 = new BasicArm("1");
        ba2 = new BasicArm("2");
        items = 0;
    }

    protected double getBatteryRequirementForMovement() {
        return super.getBatteryRequirementForMovement() + getCarriedItemsCount() * TRANSPORT_OBJECT_CONSUMPTION;
    }

    @Override
    public boolean pickUp() {
        if(items == 2) {
            return false;
        }
        if(isBatteryEnough(ba1.getConsumptionForPickUp()) && !ba1.isGrabbing()) {
            ba1.pickUp();
            items++;
            return true;
        }
        if(isBatteryEnough(ba2.getConsumptionForPickUp()) && !ba2.isGrabbing()) {
            ba2.pickUp();
            items++;
            return true;
        }
        return false;
    }

    @Override
    public boolean dropDown() {
        if(items == 0) {
            return false;
        } 
        if(isBatteryEnough(ba1.getConsumptionForPickUp()) && ba1.isGrabbing()) {
            ba1.dropDown();
            items--;
            return true;
        }
        if(isBatteryEnough(ba2.getConsumptionForPickUp()) && ba2.isGrabbing()) {
            ba2.dropDown();
            items--;
            return true;
        }
        return false;
    }

    @Override
    public int getCarriedItemsCount() {
        return this.items;
    }

    
}