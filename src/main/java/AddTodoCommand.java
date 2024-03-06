public class AddTodoCommand extends Command {
    private String description;

    public AddTodoCommand(String description) {
        this.description = description;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Todo newTodo = new Todo(description);
        tasks.appendTask(newTodo);
        ui.printTaskAdded(newTodo, tasks.retrieveAllTasks());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

