import java.util.ArrayList;

public class ExitCommand extends Command {
    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showLine();
        ui.printHello();
        return null;
    }

    @Override
    public boolean isExit() {
        return true;
    }
}

