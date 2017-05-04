package edu.iis.powp.command;

public class CircleFactory {
	public static ComplexCommand create(int x, int y, int radius){
		ComplexCommand commands = new ComplexCommand();
		int currX, currY;
		commands.add(new CommandSetPosition(x + radius, y));
		for(int i = 1; i <=360; i++){
			currX = (int) (x + radius * Math.cos(i * 2 *Math.PI / 360));
			currY = (int) (y + radius * Math.sin(i * 2 *Math.PI / 360));
			commands.add(new CommandDrawLineToPosition(currX, currY));
		}
		return commands;
	}
}
