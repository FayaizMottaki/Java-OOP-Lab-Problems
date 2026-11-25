/*
 * Question 1: A top-level class can be public or package-private.
 * It cannot be private or protected because those modifiers restrict members
 * inside an enclosing class. A public class name must match its file name.
 */
public class Chapter5_Problem1 {
    public static void main(String[] args) {
        PackageLevelHelper helper = new PackageLevelHelper();
        helper.showMessage();
        System.out.println("A private top-level class causes a compile-time error.");
    }
}

class PackageLevelHelper {
    void showMessage() {
        System.out.println("A package-private top-level class is valid.");
    }
}
