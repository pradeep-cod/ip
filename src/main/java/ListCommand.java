import java.util.ArrayList;
public class ListCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printTasks(tasks.retrieveAllTasks());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

