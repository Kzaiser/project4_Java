import java.io.IOException;
import java.util.Scanner;

public class Project4 {
    static Scnaner scanner = new Scanner(System.in);

    static String menu[] = {
                "======================== CS 3990 Assignment 1 ===============",
        "G:   Ask for a N, and generate N members of mixed",
        "       kinds and put them into three list structures.",
        "       Make sure you destroy the lists before creating",
        "       new ones if the lists are not empty",
        "",
        "S:   List members in stack, 1 member per line,",
        "       20 members per screen with header line,",
        "       allow Q/q to quit listing after each 20 members.",
        "       List last 20 members if quit early",
        "",
        "Q:   List members in queue (same requirements).",
        "",
        "O:   List members in ordered queue (same requirements).",
        "",
        "D:   Remove first element from queue, pop member from",
        "       stack, and delete the same member from sorted queue",
        "       as the one removed from the stack.",
        "",
        "I:   Randomly generate new member, and put the object",
        "       into three structures. Print out the new member",
        "       added in.",
        "-------------------------------------------------------------",
        "H/h/?: Display this menu.",
        "E/e:   Exit",
        "============================================================="
    };
}