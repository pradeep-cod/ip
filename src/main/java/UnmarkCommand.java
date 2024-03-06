public class UnmarkCommand extends Command {
    private int taskNumber;

    public UnmarkCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.fetchTaskByIndex(taskNumber);
        if (task != null) {
            task.unmarkAsDone();
            ui.showLine();
            ui.printTaskAdded(task, tasks.retrieveAllTasks());
        } else {
            throw new DukeException("Invalid task number!");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

