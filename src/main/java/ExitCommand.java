public class ExitCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showLine();
        ui.printHello();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}

