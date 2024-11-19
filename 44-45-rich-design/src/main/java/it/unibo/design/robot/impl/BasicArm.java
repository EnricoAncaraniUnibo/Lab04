package it.unibo.design.robot.impl;

public class BasicArm {
    private final String id;
    private boolean grabbing;
    private final static double COST_TO_DROP = 0.1;
    private final static double COST_TO_PICK = 0.2;

    public BasicArm(final String id) {
        this.id = id;
        this.grabbing = false;
    }

    public String getId() {
        return id;
    }

    public boolean isGrabbing() {
        return grabbing;
    }

    public void pickUp() {
        this.grabbing = true;
    }

    public void dropDown() {
        this.grabbing = false;
    }

    public double getConsumptionForPickUp() {
        return COST_TO_PICK;
    }

    public double getConsumptionForDropDown() {
        return COST_TO_DROP;
    }
}
