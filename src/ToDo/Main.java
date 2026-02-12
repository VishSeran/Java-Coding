package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){

        ArrayList<Task> todoList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println(
                    "Press 1 to add a task, " +
                    "\n2 to view all the tasks " +
                    "\n3 to change status of tasks " +
                    "\n4 to delete a task " +
                    "\nAny other key to exit");
    }
}
