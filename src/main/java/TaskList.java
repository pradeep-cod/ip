import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void appendTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index - 1);
    }

    public ArrayList<Task> retrieveAllTasks() {
        return tasks;
    }

    public Task fetchTaskByIndex(int index) {
        return tasks.get(index - 1);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
