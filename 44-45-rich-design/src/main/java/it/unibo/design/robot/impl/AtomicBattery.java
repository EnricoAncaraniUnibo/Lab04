package it.unibo.design.robot.impl;

public class AtomicBattery extends Component{

    @Override
    public void use() {
        if(this.isActive()) {
            this.getRobot().recharge();
        }
    }
    
}
