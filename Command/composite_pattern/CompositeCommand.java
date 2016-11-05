package edu.greenriver.it.composite_pattern;

import java.util.ArrayList;
import java.util.List;

import edu.greenriver.it.commands.ICommand;

public class CompositeCommand implements ICommand
{
	private List<ICommand> commands = new ArrayList<ICommand>();
	
	public CompositeCommand()
	{
		
	}
	
	public void addCommand(ICommand command)
	{
		commands.add(command);
	}

	@Override
	public void execute() 
	{
		for (int i = 0; i < commands.size(); i++)
		{
			commands.get(i).execute();
		}
	}

	@Override
	public void unexecute() 
	{
		for (int i = 0; i < commands.size(); i++)
		{
			commands.get(i).unexecute();
		}
	}

}
