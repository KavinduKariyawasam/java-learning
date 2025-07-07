import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        List<String> tasks = new ArrayList<>();

        do {
            System.out.print("\nToDo List \n");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");

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
                    System.out.println("This is the remove task menu");
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
            for (int i = 0; i < tasks.size(); i++){
                System.out.println((i+1) + " " + tasks.get(i));
            }
        }
    }

    public static void addTasks(List<String> tasks){
        System.out.print("Enter your task to add: ");
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully !");
    }
}