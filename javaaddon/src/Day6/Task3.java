package Day6;

class Task3 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Task3 t1 = new Task3();
        Task3 t2 = new Task3();

        t1.start();
        try {
            t1.join(); // Wait for t1 to finish before starting t2
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
