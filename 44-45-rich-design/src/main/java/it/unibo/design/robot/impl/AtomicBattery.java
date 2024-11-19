package it.unibo.design.robot.impl;

public class AtomicBattery extends Component{

    @Override
    public void use() {
        if(this.isActive()) {
            if(this.getRobot().getBatteryLevel()<BaseRobot.BATTERY_FULL/2) {
                this.getRobot().recharge();
            }
        }
    }
    
}
