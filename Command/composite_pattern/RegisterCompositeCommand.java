package edu.greenriver.it.composite_pattern;

import edu.greenriver.it.commands.ICommand;

public class RegisterCompositeCommand implements ICommand
{
	private ICommand[] subCommands = new ICommand[4];
	
	public RegisterCompositeCommand()
	{
//		subCommands[0] = new ValidateCommand();
//		subCommands[1] = new AddToClassCommand();
//		subCommands[2] = new EmailCommand();
//		subCommands[3] = new AddToCanvasCommand();
	}

	@Override
	public void execute() 
	{
		
	}

	@Override
	public void unexecute() 
	{
		
	}
}
