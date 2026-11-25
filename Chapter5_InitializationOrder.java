public class InitializationOrder {
    static int staticValue = log("1. Static field initializer");

    static {
        System.out.println("2. Static initializer block");
    }

    int instanceValue = log("3. Instance field initializer");

    {
        System.out.println("4. Instance initializer block");
    }

    InitializationOrder() {
        System.out.println("5. Constructor body");
    }

    private static int log(String message) {
        System.out.println(message);
        return 1;
    }

    public static void main(String[] args) {
        new InitializationOrder();
        System.out.println("---");
        new InitializationOrder();
    }
}
