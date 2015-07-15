package command;

public class RequestInvoker {
		
	public void executeAction(ICommand cmd)
	{
		cmd.execute();
	}
	
	public void undoAction(ICommand cmd)
	{
		cmd.undo();
	}
}
