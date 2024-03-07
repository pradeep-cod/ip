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

    public ArrayList<Task> findTasks(String keyword) {
        ArrayList<Task> matchingTasks = new ArrayList<>();
        int taskIndex = 0; // Initialize a counter to iterate through tasks

        // Iterate through tasks until no more matches are found
        while (taskIndex < tasks.size()) {
            Task task = tasks.get(taskIndex); // Get the current task
            if (task.description.toLowerCase().contains(keyword.toLowerCase())) {
                matchingTasks.add(task); // Add the matching task to the list
            }
            taskIndex++; // Increment the counter to move to the next task
        }

        return matchingTasks;
    }


}
