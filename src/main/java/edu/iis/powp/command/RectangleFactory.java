package edu.iis.powp.command;

public class RectangleFactory {
	public static ComplexCommand create(int x, int y, int height, int width){
		ComplexCommand commands = new ComplexCommand();
		commands.add(new CommandSetPosition(x, y));		
		commands.add(new CommandDrawLineToPosition(x + height, y));
		commands.add(new CommandDrawLineToPosition(x + height, y + width));
		commands.add(new CommandDrawLineToPosition(x, y + width));
		commands.add(new CommandDrawLineToPosition(x, y));
		return commands;
	}
}
