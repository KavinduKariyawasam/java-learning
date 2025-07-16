import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        List<String> tasks = new ArrayList<>();

        do {
            System.out.println("\n----------------------");
            System.out.print("\nToDo List \n");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.println("----------------------\n");

            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    viewTasks(tasks);
                    break;
                case 2:
                    addTasks(tasks);
                    break;
                case 3:
                    removeTask(tasks);
                    break;
                case 4:
                    System.out.println("Existing the program");
                    break;
            }

        } while (choice != 4);
    }

    public static void viewTasks(List<String> tasks){
        if (tasks.isEmpty()){
            System.out.println("There are no tasks.");
        } else {
            System.out.println("\n----------------------");
            System.out.println("Your tasks are HERE:");
            System.out.println("----------------------");
            for (int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + " " + tasks.get(i));
            }
            System.out.println("----------------------\n");
        }
    }

    public static void addTasks(List<String> tasks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----------------------");
        System.out.println("Type 'back' to go back");
        System.out.println("----------------------");
        String task = "";
        while (!task.equals("back")){
            System.out.print("Enter the task to add: ");
            task = scan.nextLine();
            if (!task.equals("back")) {
                tasks.add(task);
                System.out.println("Task added successfully !");
            }
        }
        System.out.println("----------------------\n");
    }

    public static void removeTask(List<String> tasks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n----------------------");
        System.out.println("Enter 0 to view tasks list");
        System.out.println("----------------------");
        System.out.print("Enter the task number to remove: ");
        int option = scan.nextInt();

        if (option == 0) {
            viewTasks(tasks);
            removeTask(tasks);
        }
        else if (option > 0 && option < tasks.size()) {
            tasks.remove(option - 1);
        }
        else {
            System.out.println("Invalid option");
            System.out.println("----------------------\n");
        }
    }
}