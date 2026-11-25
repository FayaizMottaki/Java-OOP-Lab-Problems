# Chapter 5: Discussion 5 Questions

## Question 1: Why can't a top-level class be private?

A top-level class is visible at the package level. Java allows it to be declared `public` (visible outside its package) or with no access modifier (package-private). A top-level class cannot be `private` or `protected`; those modifiers apply to members and nested classes.

For a public top-level class, the source file name must match the class name. For example, `public class MyClass` belongs in `MyClass.java`.

This is invalid:

```java
private class MyClass {
}
```

The compiler reports that the `private` modifier is not allowed on a top-level class.

## Question 2: Why can't an instance variable be assigned a new value directly in the class body?

The class body contains declarations and initializer blocks. A bare assignment such as `lang = "Python";` is a statement, and Java does not allow arbitrary statements directly in a class body.

Initialize the field where it is declared:

```java
class Language {
    String lang = "Python";
}
```

Or assign it in a constructor, an instance initializer block, or an instance method:

```java
class Language {
    String lang;

    Language() {
        lang = "Python";
    }
}
```

## Question 3: What are initializer blocks, and how do they differ from constructors?

An initializer block is a block of code written in a class body outside any method or constructor.

- A **static initializer block** runs once when the class is initialized. Static field initializers and static blocks run in their textual order.
- An **instance initializer block** runs each time an object is created. Instance field initializers and instance blocks run in their textual order during construction, before the constructor body.
- A **constructor** initializes a new object and can accept parameters. It runs for every object creation, after the superclass constructor and the instance initialization steps.

Static initialization of a superclass happens before static initialization of its subclass. The Java example in [InitializationOrder.java](InitializationOrder.java) shows the order for one class.
