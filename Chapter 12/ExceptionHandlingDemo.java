import java.util.Scanner;

public class ExceptionHandlingDemo {
    static int divide(String numeratorText, String denominatorText) {
        int numerator = Integer.parseInt(numeratorText);
        int denominator = Integer.parseInt(denominatorText);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Numerator: ");
            String numerator = input.nextLine();
            System.out.print("Denominator: ");
            String denominator = input.nextLine();
            try {
                System.out.println("Result: " + divide(numerator, denominator));
            } catch (NumberFormatException exception) {
                System.out.println("Enter whole numbers only.");
            } catch (ArithmeticException exception) {
                System.out.println("Cannot divide by zero.");
            } finally {
                System.out.println("Division attempt finished.");
            }
        }
    }
}
