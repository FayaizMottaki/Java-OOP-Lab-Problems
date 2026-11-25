# Discussion 5 answers

1. A top-level class is declared directly in a source file, outside another class. It can be `public` or package-private. It cannot be `private` or `protected` because those access levels require an enclosing type. A public top-level class must have the same name as its `.java` file.

2. `lang = "Python";` is an assignment statement, and Java does not allow free-standing statements directly in a class body. Put the assignment in a field initializer, initializer block, constructor, or method.

3. An initializer block is code in the class body outside a method or constructor. A static initializer runs once when the class is initialized. Instance field initializers and instance initializer blocks run for each new object, in source order, after the superclass constructor and before the constructor body. A constructor initializes a new object and may accept parameters.

4. For a class being initialized, static field initializers and static initializer blocks run in source order once. When creating an instance, the superclass constructor runs first; then this class's instance field initializers and instance blocks run in source order; finally its constructor body runs. The executable example in `WalletApp.java` covers the wallet tasks from the same discussion; initializer ordering is shown by the class rules above.
