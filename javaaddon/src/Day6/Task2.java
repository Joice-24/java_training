package Day6;

class Task2 implements Runnable {
    public void run() {
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task2());
        Thread t2 = new Thread(new Task2());
        t1.start();
        t2.start();
    }
}
