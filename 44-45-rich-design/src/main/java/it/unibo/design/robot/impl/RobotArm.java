package it.unibo.design.robot.impl;

public class RobotArm extends CommandableRobotPart{
    private boolean grabbing;
    private final static double COST_TO_PICK = 0.2;
    private final static double COST_TO_DROP = 0.1;
    private final static double COST_TO_MOVE = 0.1;
    private final String[] availableCommands = {"pick", "down"};

    @Override
    public void use() {
        if(isActive()) {
            pickUp();
            dropDown();
        }   
    }
    
    @Override
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
        if(this.getRobot().getBatteryLevel()>COST_TO_PICK) {
            this.getRobot().consume(COST_TO_PICK);
            this.grabbing = true;
        }
    }

    private void dropDown() {
        if(this.getRobot().getBatteryLevel()>COST_TO_DROP) {
            this.getRobot().consume(COST_TO_DROP);
            this.grabbing = false;
        }
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

    @Override
    public double getCostAction(String command) {
        if(isActive()) {
            if(command == "pick") {
                return COST_TO_PICK;
            }
            if(command == "drop") {
                return COST_TO_DROP;
            }
        }
        return 0;
    }
}
