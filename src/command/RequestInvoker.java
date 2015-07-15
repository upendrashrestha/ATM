package command;

public class RequestInvoker {
	ICommand cmd;
	public void executeAction()
	{
		cmd.execute();
	}
	
	public void undoAction()
	{
		cmd.undo();
	}
}
