package it.unibo.design.robot.test;

import it.unibo.design.robot.api.Component;
import it.unibo.design.robot.impl.AtomicBattery;
import it.unibo.design.robot.impl.BasicArm;
import it.unibo.design.robot.impl.BorderNavigator;
import it.unibo.design.robot.impl.ComponibleRobot;

/**
 * Utility class for testing composable robots
 */
public final class TestComposableRobot {

    private static final int CYCLES = 200;

    private TestComposableRobot() { }

    public static void main(final String[] args) {
        final ComponibleRobot r0 = new ComponibleRobot();
        final Component navi = new BorderNavigator();
        final Component battery = new AtomicBattery();
        final BasicArm arm1 = new BasicArm("1");
        final BasicArm arm2 = new BasicArm("2");

        r0.attachComponent(navi);
        r0.attachComponent(battery);
        r0.attachComponent(arm1);
        r0.attachComponent(arm2);
        /*
         * Turn on components
        navi.turnOn();
        arm1.turnOn();
        arm2.turnOn();
         */
        /*
         * Run some cycles
        for (int i = 0; i < CYCLES; i++) {
            if (r0.getBatteryLevel() < BaseRobot.BATTERY_FULL / 2) {
                battery.turnOn();
            } else {
                battery.turnOff();
            }
            arm1.sendCommand(arm1.availableCommands()[i % arm1.availableCommands().length]);
            arm2.sendCommand(arm2.availableCommands()[i % arm2.availableCommands().length]);
            r0.doCycle();
        }
         */
        /*
         * Detach components
        r0.detachComponent(arm1);
        r0.detachComponent(arm2);
         */
        /*
         * Test if it runs anyway
        r0.doCycle();
        r0.doCycle();
         */
    }
}
