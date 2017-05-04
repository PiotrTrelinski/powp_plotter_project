package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.command.CommandSetPosition;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController controller;
	private ILine line;
    public LinePlotterAdapter(DrawPanelController controller, ILine line) {
		super();
		this.controller = controller;
		this.line = line;
	}
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
		controller.drawLine(line);
		CommandSetPosition command = new CommandSetPosition(x, y);
		command.execute(this);
    }

    @Override
    public String toString()
    {
        return "LinePlotterAdapter";
    }
}

