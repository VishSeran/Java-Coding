package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<Task> todoList = new ArrayList<>();
            Scanner userInput = new Scanner(System.in);

            while (true) {

                System.out.println(
                        "\nPress 1 to add a task, "
                        + "\n2 to view all the tasks "
                        + "\n3 to change status of tasks "
                        + "\n4 to delete a task "
                        + "\nAny other key to exit\n");

                String userSelection = userInput.nextLine();

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

                    if (taksPosition > (todoList.size())) {
                        System.err.println("Position is invalid");

                    } else {

                        System.out.println("What status do you want to select: ");
                        System.out.println(" type 1: In progress \n type 2: Completed ");

                        String status = userInput.nextLine();

                        if (status.equals("1")) {
                            todoList.get(taskIndex).setStatus(Task.IN_PROGRESS);
                            System.out.println("Task updated");
                        } else if (status.equals("2")) {
                            todoList.get(taskIndex).setStatus(Task.COMPLETE);
                            System.out.println("Task updated");
                        } else {
                            System.err.println("Invalid selection");
                        }

                    }

                } else if (userSelection.equals("4")) {

                    System.out.println("\nTask loading...\n");
                    todoList.forEach((task) -> System.out.println(task));

                    System.out.println("Enter the task position you like to delete: ");
                    int taskPosition = Integer.parseInt(userInput.nextLine());
                    int taskIndex = taskPosition - 1;

                    if (taskPosition > todoList.size()) {
                        System.err.println("Invaid position selection.");
                    } else {
                        todoList.remove(taskIndex);
                        System.out.println("Task deleted");
                    }

                } else {
                    break;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }

}
