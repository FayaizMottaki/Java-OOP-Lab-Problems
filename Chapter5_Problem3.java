/*
 * Question 3: Static initialization runs once when the class is initialized.
 * Instance initialization runs for every object before its constructor body.
 * Field initializers and initializer blocks run in textual order.
 */
public class Chapter5_Problem3 {
    static int staticValue = print("1. Static field initializer");

    static {
        System.out.println("2. Static initializer block");
    }

    int instanceValue = print("3. Instance field initializer");

    {
        System.out.println("4. Instance initializer block");
    }

    Chapter5_Problem3() {
        System.out.println("5. Constructor body");
    }

    private static int print(String message) {
        System.out.println(message);
        return 1;
    }

    public static void main(String[] args) {
        new Chapter5_Problem3();
        System.out.println("--- Creating another object ---");
        new Chapter5_Problem3();
    }
}
