public class WalletApp {
    // Task 1: passing a primitive balance returns a new value; it does not
    // update the caller's variable unless the returned value is assigned.
    private static double deposit(double balance, double amount) {
        requirePositive(amount);
        return balance + amount;
    }

    private static double withdraw(double balance, double amount) {
        requirePositive(amount);
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        return balance - amount;
    }

    private static void requirePositive(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    // Task 5: object state can be changed through its methods. Reassigning a
    // parameter alone cannot swap the caller's references, so swap array slots.
    private static void addBonus(Wallet wallet, double amount) {
        wallet.deposit(amount);
    }

    private static void swapWallets(Wallet[] wallets, int first, int second) {
        Wallet temporary = wallets[first];
        wallets[first] = wallets[second];
        wallets[second] = temporary;
    }

    public static void main(String[] args) {
        double balance1 = 100.0;
        double balance2 = 50.0;
        balance1 = deposit(balance1, 25.0);
        balance2 = withdraw(balance2, 10.0);
        System.out.printf("Procedural balances: %.2f, %.2f%n", balance1, balance2);

        // Tasks 2-4: private balance, constructor overloads, unique final ID,
        // overloaded withdrawal, and remembered withdrawal mode.
        Wallet first = new Wallet();
        Wallet second = new Wallet(75.0);
        first.deposit(40.0);
        first.withdraw(10.0);
        second.withdraw(5.0, "ATM");
        addBonus(first, 15.0);
        System.out.printf("Wallet %d balance=%.2f, last mode=%s%n",
                first.getId(), first.getBalance(), first.getLastWithdrawMode());
        System.out.printf("Wallet %d balance=%.2f, last mode=%s%n",
                second.getId(), second.getBalance(), second.getLastWithdrawMode());

        Wallet[] wallets = {first, second};
        swapWallets(wallets, 0, 1);
        System.out.println("After swapping array references: "
                + wallets[0].getId() + ", " + wallets[1].getId());
    }
}

final class Wallet {
    private static int nextId = 1;

    private final int id;
    private double balance;
    private String lastWithdrawMode = "NONE";

    Wallet() {
        this(0.0);
    }

    Wallet(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.id = nextId++;
        this.balance = initialBalance;
    }

    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    String getLastWithdrawMode() {
        return lastWithdrawMode;
    }

    void deposit(double amount) {
        requireAmount(amount);
        balance += amount;
    }

    void withdraw(double amount) {
        withdraw(amount, "NORMAL");
    }

    void withdraw(double amount, String mode) {
        requireAmount(amount);
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        String normalizedMode = mode.trim().toUpperCase();
        if (!normalizedMode.equals("NORMAL")
                && !normalizedMode.equals("ATM")
                && !normalizedMode.equals("ONLINE")) {
            throw new IllegalArgumentException("Mode must be NORMAL, ATM, or ONLINE");
        }
        balance -= amount;
        lastWithdrawMode = normalizedMode;
    }

    private static void requireAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
