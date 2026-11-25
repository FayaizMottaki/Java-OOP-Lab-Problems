/*
 * Chapter 5 - Discussion 5
 * Solutions to Questions 1, 2, and 3 in slide order.
 */
public class Chapter5 {
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
    }

    // Question 1: A top-level class can be public or package-private.
    // It cannot be private or protected because there is no enclosing class
    // whose visibility could be restricted. A public top-level class must
    // have the same name as its source file.
    private static void problem1() {
        System.out.println("Problem 1: Top-level class access");
        PackageLevelExample example = new PackageLevelExample();
        example.showMessage();
        System.out.println("Only public and package-private are valid for top-level classes.");
        // private class HiddenExample {} // Compile-time error at top level.
        System.out.println();
    }

    // Question 2: A bare assignment is a statement, and Java does not allow
    // statements directly in a class body. Field declarations, initializer
    // blocks, constructors, and methods are valid places for initialization
    // or assignment.
    private static void problem2() {
        System.out.println("Problem 2: Assigning an instance variable");
        Language language = new Language("Python");
        System.out.println("Constructor assignment: " + language.lang);
        language.setLanguage("Java");
        System.out.println("Method assignment: " + language.lang);
        System.out.println();
    }

    // Question 3: Static initialization happens once when the class is first
    // initialized. Instance field initializers and instance blocks run for
    // every object, in textual order, before that object's constructor body.
    private static void problem3() {
        System.out.println("Problem 3: Initializer blocks and constructors");
        new InitializationOrder();
        System.out.println("--- Creating another object ---");
        new InitializationOrder();
    }

    private static class Language {
        String lang = "Java"; // A field declaration initializer is valid.

        Language(String language) {
            lang = language; // Assignment in a constructor is valid.
        }

        void setLanguage(String language) {
            lang = language; // Assignment in a method is valid.
        }
    }

    private static class InitializationOrder {
        static int staticValue = print("1. Static field initializer");

        static {
            System.out.println("2. Static initializer block");
        }

        int instanceValue = print("3. Instance field initializer");

        {
            System.out.println("4. Instance initializer block");
        }

        InitializationOrder() {
            System.out.println("5. Constructor body");
        }

        private static int print(String message) {
            System.out.println(message);
            return 1;
        }
    }
}

// A package-private top-level class is valid in the same file.
class PackageLevelExample {
    void showMessage() {
        System.out.println("A package-private top-level class is valid.");
    }
}
