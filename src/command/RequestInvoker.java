package command;

import java.util.Stack;

public class RequestInvoker {
		
	private Stack cmdStack = new Stack<ICommand>();
	
	public void executeAction(ICommand cmd)
	{
		cmdStack.push(cmd);
		cmd.execute();
		
	}
	
	public void undoAction(ICommand cmd)
	{
		cmd.undo();
	}
}
