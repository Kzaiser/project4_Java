import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Project4 {
    static int n;
    static boolean bool = false;
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static String menu[] = {
            "+===================================================+",
            "|    CS 3390 Assignment:  Linked List Structures    |",
            "+===================================================+",
            "| G: Ask for a N, and generate 2XN members of mixed |",
            "|   kinds and put them into three list structures.  |",
            "|    Make sure you destroy the lists before creating|",
            "|    new ones if the lists are not empty.           |",
            "+---------------------------------------------------+",
            "| S/s: List members in stack, 1 member per line,      |",
            "|  20 members per screen with header line, allow    |",
            "|  Q/q to quit listing after each 20 members.       |",
            "|  List last 20 members if program quit early.      |",
            "+---------------------------------------------------+",
            "| Q/q: List members in queue.                         |",
            "+---------------------------------------------------+",
            "| O/o: List members in ordered queue sorted by SSN    |",
            "+---------------------------------------------------+",
            "| D/d: Remove first element from queue, pop member    |",
            "|    from stack, and delete the same member from    |",
            "|    sorted queue as the one removed from stack.    |",
            "+---------------------------------------------------+",
            "| C: Pick up a stack, queue or sorted quene. Call   |",
            "|    That object' copy constructor, and show both   |",
            "|    members of both structures side-by-side:       |",
            "|    Original One           Copy Constructor Crted  |",
            "+---------------------------------------------------+",
            "| I/i: Randomly generate new member, and put        |",
            "|    the object into the three structures. Print    |",
            "|    out the new member added in.                   |",
            "+---------------------------------------------------+",
            "| H/h/?: Display this menu.                           |",
            "| E/e : Exit                                         |",
            "+===================================================+"
    };

    static char showAndGetMenuItem() {
        if(bool==true) {
            for (int i = 0; i < menu.length; i++) {
            System.out.printf("\n\t\t%s", menu[i]);
            }
            System.out.printf("\n\n\t\t%s", "Enter a command or E for quit: ");
    
        } else {
            System.out.printf("\n\n\t\t%s", "Enter a command: G/g, S/s, Q/q, D/d, I/i, H/h/? to Toggle Command Menu, or E to Quit: ");
        }
        return scanner.next().trim().charAt(0);
    }

    static Member nextMember() {
        switch (rand.nextInt(5)) {
            case 0:
                return new Member();
            case 1:
                return new Employee();
            case 2:
                return new Student();
            case 3:
                return new Faculty();
            case 4:
                return new Staff();
        }
        return new Member();
    }

    public static void main( String args[] ) {
        char choice = ' ';

        while (true) {
            choice = showAndGetMenuItem();

            switch(choice) {
                case 'H': case 'h': case '?':
                    bool = !bool;
                    break;
                case 'G': case 'g':
                    generateAndStore();
                    break;
                case 'S': case 's': 
                    break;
                case 'Q': case 'q':
                    break;
                case 'O': case 'o':
                    break;
                case 'D': case 'd':
                /*
                Check to see if the stack has anything in it.
                If it doesn't, print out that there is nothing to delete.
                Otherwise, pop from the stack, deque from the queue, and deque from the sortedQueue. 
                */
                    break;
                case 'I': case 'i':
                    break;
                case 'E': case 'e':
                    System.exit(0);
                    return;
                    // break;
                default:
                    System.out.println("Run the program again with a different input!");
                    break;
            }
        }
    }

    static void generateAndStore() {
        System.out.printf("\n\t\t Members to be generated?\n");
        try {
            n = scanner.nextInt();
            n *= 2;
        } catch (InputMismatchException e) {
            System.out.println("\n\t\t Input a value!\n");
        }
        
        /* Create: Doubly Linked List, Stack, and Queue 
         First, check if the stack is empty and if it is empty,
         add all of the members to the data structures.
         Otherwise, remove everything from the array and generate the members
         afterwards. 
        */
        // if (stack.empty()) {
            
        // }
    }
}
