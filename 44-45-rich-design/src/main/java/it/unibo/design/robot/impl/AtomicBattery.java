package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Component;
import it.unibo.design.robot.api.ComponibleRobotInterface;

public class AtomicBattery implements Component{
   

    public AtomicBattery() {
        this.active = false;
        robot = null;
    }

    

    public void use() {
        if(robot != null && robot.getBatteryLevel()<50) {
            robot.recharge();
        }
    }
    
}
