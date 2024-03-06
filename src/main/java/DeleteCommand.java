public class DeleteCommand extends Command {
    private int taskNumber;

    public DeleteCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.fetchTaskByIndex(taskNumber);
        if (task != null) {
            tasks.removeTask(taskNumber);
            ui.printTaskRemoved(task, tasks.retrieveAllTasks());
        } else {
            throw new DukeException("Invalid task number!");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
