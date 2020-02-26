import java.io.IOException;
import java.util.Scanner;

public class Project4 {
    static Scanner scanner = new Scanner(System.in);

    static String menu[] = {
        "======================== CS 3390 Assignment 4 ===============",
        "G/g:   Ask for a N, and generate N members of mixed",
        "       kinds and put them into three list structures.",
        "       Make sure you destroy the lists before creating",
        "       new ones if the lists are not empty",
        "",
        "S/s:   List members in stack, 1 member per line,",
        "       20 members per screen with header line,",
        "       allow Q/q to quit listing after each 20 members.",
        "       List last 20 members if quit early",
        "",
        "Q/q:   List members in queue (same requirements).",
        "",
        "O/o:   List members in ordered queue (same requirements).",
        "",
        "D/d:   Remove first element from queue, pop member from",
        "       stack, and delete the same member from sorted queue",
        "       as the one removed from the stack.",
        "",
        "I/i:   Randomly generate new member, and put the object",
        "       into three structures. Print out the new member",
        "       added in.",
        "-------------------------------------------------------------",
        "H/h/?: Display this menu.",
        "E/e:   Exit",
        "============================================================="
    };

    static int n;
    static boolean bool = false;

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

    public static void main( String args[] ) {
        char choice = ' ';

        while (true) {
            choice = showAndGetMenuItem();

            switch(choice) {
                case 'H': case 'h': case '?':
                    bool = !bool;
                    break;
                case 'G': case 'g':
                    break;
                case 'S': case 's': 
                    break;
                case 'Q': case 'q':
                    break;
                case 'O': case 'o':
                    break;
                case 'D': case 'd':
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
}
