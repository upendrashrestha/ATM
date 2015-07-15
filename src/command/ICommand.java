package command;

public interface ICommand {

	public boolean execute();
	public void undo(); // we can replace it to rollback()
}
