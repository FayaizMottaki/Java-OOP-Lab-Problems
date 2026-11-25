public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Thread first = new Thread(new CounterTask(counter, 1000), "runnable-worker");
        Thread second = new CounterThread(counter, 1000);
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Final counter: " + counter.getValue());
    }
}

final class SafeCounter {
    private int value;
    synchronized void increment() { value++; }
    synchronized int getValue() { return value; }
}

final class CounterTask implements Runnable {
    private final SafeCounter counter;
    private final int repetitions;
    CounterTask(SafeCounter counter, int repetitions) {
        this.counter = counter; this.repetitions = repetitions;
    }
    @Override public void run() {
        for (int i = 0; i < repetitions; i++) counter.increment();
    }
}

final class CounterThread extends Thread {
    private final SafeCounter counter;
    private final int repetitions;
    CounterThread(SafeCounter counter, int repetitions) {
        this.counter = counter; this.repetitions = repetitions;
    }
    @Override public void run() {
        for (int i = 0; i < repetitions; i++) counter.increment();
    }
}
