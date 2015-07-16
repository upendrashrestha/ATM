package command;

public interface ICommand {

	public void execute();
	public void undo(); // we can replace it to rollback()
}
