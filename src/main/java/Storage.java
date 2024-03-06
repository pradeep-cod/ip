import java.io.*;
import java.util.ArrayList;

public class Storage {
    private String filePath;

    public Storage(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<Task> load() throws DukeException {
        ArrayList<Task> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine(); // Initialization before the loop
            while (line != null) { // Condition
                Task task = Task.fromString(line);
                if (task != null) {
                    tasks.add(task);
                }
                line = reader.readLine(); // Increment/decrement within the loop
            }
        } catch (FileNotFoundException e) {
            throw new DukeException("File not found. Creating a new file...");
        } catch (IOException e) {
            throw new DukeException("Error loading tasks from file: " + e.getMessage());
        }
        return tasks;
    }


    public void save(ArrayList<Task> tasks) throws DukeException {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Using a for-each loop to iterate through tasks
            for (Task task : tasks) {
                writer.write(task.toFileString() + "\n");
            }
        } catch (IOException e) {
            throw new DukeException("Error saving tasks to file: " + e.getMessage());
        }
    }
}
