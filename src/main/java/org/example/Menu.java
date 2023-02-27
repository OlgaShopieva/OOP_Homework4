package org.example;

import java.util.Scanner;

public class Menu {
    private static final String MENU = "\nChoose the correct item in Menu: "
            + "\n\t1 - Show all tasks"
            + "\n\t2 - Add task"
            + "\n\t3 - Delete task";

    public static void taskMenu(){
        boolean itContinues = true;
        while (itContinues) {
            System.out.println(MENU);
            System.out.println("Enter number you need: ");
            Scanner scanner = new Scanner(System.in);
            int item = scanner.nextInt();
            switch (item) {
                case 1:
                    Program.showAllTasks();
                    break;
                case 2:
                    Program.addNewTask();
                    break;
                case 3:
                    Program.deleteTask();
                    break;
                default:
                    System.out.println("Error! Enter correct number");
                    break;
            }
        }
    }
}
