import java.util.Scanner;
import java.util.ArrayList;

public class Ui {

    private Scanner scanner;

    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    public void printHello() {
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Sura");
        System.out.println("What can I do for you?");
        System.out.println("____________________________________________________________");
    }

    public String readCommand() {
        String input = "";
        while (true) {
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                return input;
            }
        }
    }

    public void showLine() {
        System.out.println("____________________________________________________________");
    }

    public void printError(String errorMessage) {
        System.out.println("____________________________________________________________");
        System.out.println("Error: " + errorMessage);
        System.out.println("____________________________________________________________");
    }

    public void printLoadingError() {
        System.out.println("____________________________________________________________");
        System.out.println("Error loading tasks from file.");
        System.out.println("____________________________________________________________");
    }

    public void printTasks(ArrayList<Task> tasks) {
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + "." + tasks.get(i));
        }
        System.out.println("____________________________________________________________");
    }

    public void printTaskAdded(Task task, ArrayList<Task> tasks) {
        System.out.println("Got it. I've added this task:");
        System.out.println(" " + task);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        System.out.println("____________________________________________________________");
    }

    public void printTaskRemoved(Task task, ArrayList<Task> tasks) {
        System.out.println("Noted. I've removed this task: ");
        System.out.println(" " + task);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        System.out.println("____________________________________________________________");
    }

    public void printTasksMarked(Task task, ArrayList<Task> tasks) {
        System.out.println("I have marked this task as done.");
        System.out.println(" " + task);
        System.out.println("____________________________________________________________");
    }

    public void printTasksUnmarked(Task task, ArrayList<Task> tasks) {
        System.out.println("I have unmarked this task.");
        System.out.println(" " + task);
        System.out.println("____________________________________________________________");
    }



}
