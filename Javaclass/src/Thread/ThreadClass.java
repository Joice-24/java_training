package Thread;

public class ThreadClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        try {
        	Thread.sleep(10000);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
