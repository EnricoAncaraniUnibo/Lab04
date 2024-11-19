package it.unibo.design.robot.impl;

public abstract class CommandableRobotPart extends Component{
    public abstract void sendCommand(String command);

    public abstract String[] availableCommands();
}
