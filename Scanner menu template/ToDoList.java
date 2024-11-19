import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("You have no tasks added currently.");
        } else {
            System.out.println("Your current tasks: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public void markAsCompleted(int taskNumber){
        if (taskNumber < 1 || taskNumber > tasks.size()){
            System.out.println("Invalid task number");
        }else {
            String task = tasks.get(taskNumber - 1);
            tasks.set(taskNumber - 1, task + " - completed");
            System.out.println("Task marked as completed!");
        }
    }
    public void removeTask(int taskNumber){
        if (taskNumber < 1 || taskNumber > tasks.size()){
            System.out.println("Invalid task number");
        }else {
            String removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Task removed: " + removedTask);
        }
    }
}

