package Day6;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.start();
    }
}