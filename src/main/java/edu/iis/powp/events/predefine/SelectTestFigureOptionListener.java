package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CircleFactory;
import edu.iis.powp.command.RectangleFactory;

public class SelectTestFigureOptionListener implements ActionListener
{
	String testFigure = null;
	public SelectTestFigureOptionListener(String string) {
		this.testFigure = string;
	} 
	
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(testFigure == "Figure Joe 1")
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	if(testFigure == "Figure Joe 2")
    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	if(testFigure == "Rectangle")
    		RectangleFactory.create(-100, -100, 300, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	if(testFigure == "Circle")
    		CircleFactory.create(0, 0, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
