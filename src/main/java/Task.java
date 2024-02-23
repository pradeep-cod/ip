public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void unmarkAsDone() {
        this.isDone = false;
    }
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

    public String toFileString() {
        // Implement how you want to represent the task as a string for file storage
        // For example, you can concatenate the description and status with a delimiter
        return description + "|" + (isDone ? "1" : "0"); // Example format: "description|status"
    }

    /**
     * Parses a string from a file into a Task object.
     *
     * @param fileString The string read from the file representing a task.
     * @return The Task object parsed from the string.
     */
    public static Task fromString(String fileString) {
        String[] parts = fileString.split("\\|");
        String taskType = parts[0]; // Extract task type
        String description = parts[1];
        boolean isDone = parts[2].equals("1"); // Extract status

        Task task;
        switch (taskType) {
        case "D":
            task = new Deadline(description, parts[3]); // Create Deadline task
            break;
        case "E":
            task = new Event(description, parts[3], parts[4]); // Create Event task
            break;
        case "T":
            task = new Todo(description); // Create Todo task
            break;
        default:
            // Handle unknown task type
            task = null;
            break;
        }

        if (task != null && isDone) {
            task.markAsDone(); // Mark task as done if status is '1'
        }

        return task;
    }


}
