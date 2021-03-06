package edu.iis.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand extends ArrayList<PlotterCommand> implements PlotterCommand{

	private static final long serialVersionUID = 1L;

	@Override
	public void execute(IPlotter plotter) {
		for(PlotterCommand command : this){
			command.execute(plotter);
		}
	}
}

//Przez posiadanie tej klasy wykorzystywany jest wzorzec Composite