public class UnknownCommand extends Command {
    private String command;

    public UnknownCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printError("Unknown command: " + command);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

