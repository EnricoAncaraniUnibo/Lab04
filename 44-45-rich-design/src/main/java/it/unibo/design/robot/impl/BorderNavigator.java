package it.unibo.design.robot.impl;

/**
 * BorderNavigator
 */
public class BorderNavigator extends Component{

    @Override
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
                    else {
                        finitoIntro =true;
                        finito = true;
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveRight()) {
                            finitoIntro = true;
                        }
                    }else {
                        finitoIntro =true;
                        finito = true;
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveDown()) {
                            finitoIntro = true;
                        }
                    }else {
                        finitoIntro =true;
                        finito = true;
                    }
                }
                finitoIntro = false;
                while (!finitoIntro) {
                    if(this.getRobot().getBatteryLevel()>20) {
                        if(!getRobot().moveLeft()) {
                            finitoIntro = true;
                        }
                    }else {
                        finitoIntro =true;
                        finito = true;
                    }
                }
            }
        }
    }
}