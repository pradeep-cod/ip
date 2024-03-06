public class AddDeadlineCommand extends Command {
    private String description;
    private String by;

    public AddDeadlineCommand(String command) {
        String[] parts = command.split("/by");
        this.description = parts[0].trim();
        this.by = parts.length > 1 ? parts[1].trim() : "";
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        if (by.isEmpty()) {
            throw new DukeException("Please use '/by' to specify the deadline time.");
        }
        Deadline newDeadline = new Deadline(description, by);
        tasks.appendTask(newDeadline);
        ui.printTaskAdded(newDeadline, tasks.retrieveAllTasks());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

