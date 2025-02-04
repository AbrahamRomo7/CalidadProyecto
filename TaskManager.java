// TaskManager.java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + tasks.get(i));
        }
    }

    public void removeTask(int id) {
        if (id > 0 && id <= tasks.size()) { // Validating the id to prevent IndexOutOfBoundsException
            tasks.remove(id - 1);
            System.out.println("Task removed.");
        } else {
            System.out.println("Task ID " + id + " is invalid. Please enter a valid ID.");
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("Complete project");
        tm.listTasks();
        tm.removeTask(1);
        tm.listTasks(); // To show that the task has been removed
    }
}
