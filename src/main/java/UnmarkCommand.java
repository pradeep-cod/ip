import java.util.ArrayList;

public class UnmarkCommand extends Command {
    private int taskNumber;

    public UnmarkCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.fetchTaskByIndex(taskNumber);
        if (task != null) {
            task.unmarkAsDone();
            ui.showLine();
            ui.printTasksUnmarked(task, tasks.retrieveAllTasks());
        } else {
            throw new DukeException("Invalid task number!");
        }
        return null;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

