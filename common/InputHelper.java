package common;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputHelper {

    public static final Scanner sc = new Scanner(System.in);

    // Safe integer input
    public static int readInt() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("❌ Invalid input. Enter an integer: ");
                sc.nextLine(); // clear buffer
            }
        }
    }

    // Safe string input
    public static String readLine() {
        sc.nextLine(); // clear pending newline
        return sc.nextLine();
    }
}
