import java.util.ArrayList;

public class UnknownCommand extends Command {
    private String command;

    public UnknownCommand(String command) {
        this.command = command;
    }

    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printError("Unknown command: " + command);
        return null;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

