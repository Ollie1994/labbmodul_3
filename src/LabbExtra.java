import java.util.ArrayList;
import java.util.Scanner;

public class LabbExtra {
    public static void main(String[] args) {
        TryCatch tryCatch = new TryCatch();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<String>();
        while (true) {
            System.out.println("Welcome to toDo! \n1-Add\n2-Remove\n3-Print\n4-Exit");
            int choice1 = tryCatch.tryCatch1();
            switch (choice1) {
                case 1:
                    System.out.println("What would you like to add to the toDoList?");
                    toDoList.add(sc.nextLine());
                    System.out.println("array: " + toDoList);
                    break;
                case 2:
                    System.out.println(toDoList + "\nWhich toDo would you like to remove?");
                    int choice2 = tryCatch.tryCatch2(toDoList.size());
                    toDoList.remove(choice2);
                    System.out.println(toDoList);
                    break;
                case 3:
                    System.out.println("Here is your toDoList: " + toDoList);
                    System.out.println("Would you like to print out a specific toDo?");
                    int choice3 = tryCatch.tryCatch2(toDoList.size());
                    System.out.println("The toDo you chose: " + toDoList.get(choice3));
                    break;
                case 4:
                    System.out.println("Goodbye birdy!");
                    return;
            }

        }
    }
}


/*
While (true)
message
    "welcome to the toDo"
    "MENU"
declaration of array
    String toDo
    array list
input
    menu choice
    transports us to the right process
processAdd
    message ask for input
    input add "toDo string" to array
processRemove
    message ask for input
    input remove "toDo string" from array
processPrint
    message do you want to print all or print specific toDo
    message "print array or specific"

processExit
    break;
    message bye bye birdy
    exit ool/program









 */