import java.util.ArrayList;
public class ListCommand extends Command {
    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printTasks(tasks.retrieveAllTasks());
        return null;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

