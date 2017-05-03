package edu.iis.powp.adapter;

import javax.swing.JPanel;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LinePlotterAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	DrawPanelController controller;
	
    public LinePlotterAdapter(JPanel drawArea) {
		super();
		controller = new DrawPanelController();
		controller.initialize(drawArea);
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
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
		controller.drawLine(line);
		setPosition(x,y);
    }

    @Override
    public String toString()
    {
        return "LinePlotterAdapter";
    }
}