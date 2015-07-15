package command;

public class RequestInvoker {
		
	private boolean flag;
	
	public boolean executeAction(ICommand cmd)
	{
		return cmd.execute();
		
	}
	
	public void undoAction(ICommand cmd)
	{
		cmd.undo();
	}
}
