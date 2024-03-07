import java.util.ArrayList;

public class AddEventCommand extends Command {
    private String description;
    private String from;
    private String to;

    public AddEventCommand(String command) throws DukeException {
        String[] parts = command.split("/from | /to ");
        if (parts.length < 3) {
            throw new DukeException("Please use the format: event [description] /from [start time] /to [end time]");
        }
        this.description = parts[0].trim();
        this.from = parts[1].trim();
        this.to = parts[2].trim();
    }

    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Event newEvent = new Event(description, from, to);
        tasks.appendTask(newEvent);
        ui.printTaskAdded(newEvent, tasks.retrieveAllTasks());
        return null;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
