import java.util.ArrayList;

public class AddTodoCommand extends Command {
    private String description;

    public AddTodoCommand(String description) {
        this.description = description;
    }

    @Override
    public ArrayList<Task> execute(TaskList tasks, Ui ui, Storage storage) {
        Todo newTodo = new Todo(description);
        tasks.appendTask(newTodo);
        ui.printTaskAdded(newTodo, tasks.retrieveAllTasks());
        return null;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

