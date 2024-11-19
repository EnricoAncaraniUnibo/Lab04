package it.unibo.design.robot.impl;

public class RobotArm extends CommandableRobotPart{
    private boolean grabbing;
    private final static double COST_TO_ACTION = 0.2;
    private final static double COST_TO_MOVE = 0.1;
    private final String[] availableCommands = {"pick", "down"};

    @Override
    public void use() {
        if(isActive()) {
            pickUp();
            dropDown();
        }   
    }

    public void sendCommand(String command) {
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
        if(this.getRobot().getBatteryLevel()>0.2) {
            this.grabbing = true;
        }
    }

    private void dropDown() {
        if(this.getRobot().getBatteryLevel()>0.2) {
            this.grabbing = false;
        }
    }

    public double getConsumptionForAction() {
        return COST_TO_ACTION;
    }

    public double getConsumptionForMoving() {
        if(grabbing) {
            return COST_TO_MOVE;
        } else {
            return 0;
        }
    }

    @Override
    public String[] availableCommands() {
        return availableCommands;
    }
}
