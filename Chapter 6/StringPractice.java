import java.util.Scanner;

public class StringPractice {
    static String reverse(String value) {
        StringBuilder result = new StringBuilder(value.length());
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        return result.toString();
    }

    static boolean isPalindrome(String value) {
        return value.equals(reverse(value));
    }

    static int countOccurrences(String value, char target) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String value = input.nextLine();
            System.out.println("Reverse: " + reverse(value));
            System.out.println("Palindrome: " + isPalindrome(value));
            System.out.print("Character to count: ");
            String target = input.nextLine();
            if (target.isEmpty()) {
                System.out.println("No character was entered.");
            } else {
                System.out.println("Occurrences: " + countOccurrences(value, target.charAt(0)));
            }
        }
    }
}
