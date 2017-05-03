package edu.iis.powp.events.predefine;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.kis.powp.drawer.panel.DrawPanelController;

public class SelectChangeVisibleOptionListener implements ActionListener
{
	private Window controlledWindow; 
	
	
    public SelectChangeVisibleOptionListener(Window controlledWindow) {
		super();
		this.controlledWindow = controlledWindow;
	}


	@Override
    public void actionPerformed(ActionEvent e)
    {
        if (controlledWindow.isVisible()) 
        {
        	controlledWindow.setVisible(false);
        }
        else
        {
        	controlledWindow.setVisible(true);
        }
    }
}
