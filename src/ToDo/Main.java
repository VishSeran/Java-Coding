package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<Task> todoList = new ArrayList<>();
            Scanner userInput = new Scanner(System.in);

            System.out.println(
                    "Press 1 to add a task, "
                    + "\n2 to view all the tasks "
                    + "\n3 to change status of tasks "
                    + "\n4 to delete a task "
                    + "\nAny other key to exit");

            String userSelection = userInput.nextLine();

            boolean iterate = true;

            while (iterate) {

                if (userSelection.equals("1")) {

                    System.out.println("Enter the task name: ");
                    String taskName = userInput.nextLine();

                    System.out.println("Enter the priority: \n  1 - low\n 2 - medium\n 3 - high");
                    int priority = Integer.parseInt(userInput.nextLine());

                    //validation prioority
                    priority = priority > 3 ? 1 : priority;

                    Task newTask = new Task(taskName, priority);
                    todoList.add(newTask);

                    System.out.println("a new task has added to the list");

                } else if (userSelection.equals("2")) {

                    System.out.println("\nTask loading...\n");
                    todoList.forEach((task) -> System.out.println(task));

                } else if (userSelection.equals("3")) {

                    todoList.forEach((task) -> System.out.println(task));
                    System.out.println("\nSelect the task number which you want to change: ");

                    int taksPosition = Integer.parseInt(userInput.nextLine());
                    int taskIndex = taksPosition - 1;

                    if (taksPosition > (todoList.size() - 1)) {
                        System.err.println("Position is invalid");

                    } else {

                        System.out.println("What status do you want to select: ");
                        System.out.println(" type 1: In progress \n type 2: Completed ");

                        String status = userInput.nextLine();

                        if (status.equals("1")) {
                            todoList.get(taskIndex).setStatus(Task.IN_PROGRESS);
                        } else if (status.equals("2")) {
                            todoList.get(taskIndex).setStatus(Task.COMPLETE);
                        } else {
                            System.err.println("Invalid selection");
                        }

                    }

                } else if (userSelection.equals("4")) {

                } else {
                    iterate = false;
                }
            }

        } catch (Exception e) {

        }

    }

}
