/*
 * Question 2: A bare assignment is a statement, and statements cannot appear
 * directly in a class body. A field can be initialized in its declaration,
 * an initializer block, a constructor, or a method.
 */
public class Chapter5_Problem2 {
    String lang = "Java"; // Field declaration initializer is valid.

    Chapter5_Problem2(String language) {
        lang = language; // Constructor assignment is valid.
    }

    public static void main(String[] args) {
        Chapter5_Problem2 language = new Chapter5_Problem2("Python");
        System.out.println("Language: " + language.lang);

        language.lang = "Java"; // Assignment inside a method is valid.
        System.out.println("Updated language: " + language.lang);
    }
}
