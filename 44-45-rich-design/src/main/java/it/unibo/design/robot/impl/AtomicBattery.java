package it.unibo.design.robot.impl;

public class AtomicBattery extends ComponentImp{
   
    public AtomicBattery() {
        super();
    }

    public void use() {
        if(this.isActive()) {
            if(getRobot() != null && getRobot().getBatteryLevel()<50) {
                getRobot().recharge();
            }
        }
    }
}
