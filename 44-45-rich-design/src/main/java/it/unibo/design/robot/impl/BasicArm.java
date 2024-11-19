package it.unibo.design.robot.impl;

public class BasicArm extends ComponentImp{
    private final String id;
    private boolean grabbing;
    private final static double COST_TO_DROP = 0.1;
    private final static double COST_TO_PICK = 0.2;

    public void useCommand(String command) {
        if(this.isActive()) {
            if(command == "pick") {
                this.pickUp();
            }
            if(command == "down") {
                this.dropDown();
            }
        }
    }

    public BasicArm(final String id) {
        this.id = id;
        this.grabbing = false;
    }

    public boolean isGrabbing() {
        return grabbing;
    }

    public String getId() {
        return id;
    }
    
    public void pickUp() {
        if(!this.grabbing) {
            this.grabbing = true;
            this.getRobot().consumeBattery(COST_TO_PICK);
        }
    }

    public void dropDown() {
        if(this.grabbing) {
            this.grabbing = false;
            this.getRobot().consumeBattery(COST_TO_DROP);
        }
    }

    public double getConsumptionForPickUp() {
        return COST_TO_PICK;
    }

    public double getConsumptionForDropDown() {
        return COST_TO_DROP;
    }

    @Override
    public void use() {
        pickUp();
        dropDown();
    }
}
