import java.util.ArrayList;

public class MarkCommand extends Command {
    private int taskNumber;

    public MarkCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.fetchTaskByIndex(taskNumber);
        if (task != null) {
            task.markAsDone();
            ui.showLine();
            ui.printTasksMarked(task, tasks.retrieveAllTasks());
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

