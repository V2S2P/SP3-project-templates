import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the To-Do List Manager!");
            System.out.println("----------------------");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Remove a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the task: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    toDoList.viewTasks();
                    System.out.println("Enter the task number to mark as completed: ");
                    if (scanner.hasNextInt()){
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        toDoList.markAsCompleted(taskNumber);
                    }else {
                        System.out.println("Invalid input. Please enter a valid task number: ");;
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    toDoList.viewTasks();
                    System.out.println("Enter the task number to remove: ");
                    if (scanner.hasNextInt()) {
                        int removeTaskNumber = scanner.nextInt();
                        scanner.nextLine(); // Clear buffer
                        toDoList.removeTask(removeTaskNumber);
                    } else {
                        System.out.println("Invalid input. Please enter a valid task number.");
                        scanner.nextLine(); // Clear invalid input
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}