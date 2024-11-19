package it.unibo.design.robot.impl;

public class RobotArm extends CommandableRobotPart{
    private boolean grabbing;
    private final static double COST_TO_DROP = 0.1;
    private final static double COST_TO_PICK = 0.2;
    private final static double COST_TO_MOVE = 0.1;

    @Override
    public void use() {
        if(isActive()) {
            pickUp();
            dropDown();
        }   
    }

    public void useCommand(String command) {
        if(this.isActive()) {
            if(command == "pick") {
                pickUp();
            }
            if(command == "down") {
                dropDown();
            }
        }
    }

    public boolean isGrabbing() {
        return grabbing;
    }

    private void pickUp() {
        this.grabbing = true;
    }

    private void dropDown() {
        this.grabbing = false;
    }

    public double getConsumptionForPickUp() {
        return COST_TO_PICK;
    }

    public double getConsumptionForDropDown() {
        return COST_TO_DROP;
    }

    public double getConsumptionForMoving() {
        if(grabbing) {
            return COST_TO_MOVE;
        } else {
            return 0;
        }
    }
}
