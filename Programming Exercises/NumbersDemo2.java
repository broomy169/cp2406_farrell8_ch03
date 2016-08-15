import java.util.Scanner;

/**
 * Created by Graeme on 15-Aug-16.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int a = input.nextInt();
        System.out.print("Second number: ");
        int b = input.nextInt();
        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquared(a, b);
    }

    public static void displayTwiceTheNumber(int a, int b) {
        System.out.println("Twice the first number: " + (a * 2));
        System.out.println("Twice the second number: " + (b * 2));
    }

    public static void displayNumberPlusFive(int a, int b) {
        System.out.println("First number plus 5: " + (a + 5));
        System.out.println("Second number plus 5: " + (b + 5));
    }

    public static void displayNumberSquared(int a, int b) {
        System.out.println("First number squared: " + (a * a));
        System.out.println("Second number squared: " + (b * b));
    }
}
