package it.unibo.design.robot.impl;

public class BorderNavigator extends ComponentImp{
    public BorderNavigator() {
        super();
    }

    public void use() {
        if(this.isActive()) {
            boolean finito = false;
            boolean finitoIntro = false;
            while (!finito) {
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveUp()) {
                            finitoIntro = true;
                        }
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveRight()) {
                            finitoIntro = true;
                        }
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveDown()) {
                            finitoIntro = true;
                        }
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveLeft()) {
                            finitoIntro = true;
                        }
                    }
                }
            }
        }
    }
}
