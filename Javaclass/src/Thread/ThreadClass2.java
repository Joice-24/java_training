package Thread;

public class ThreadClass2 extends Thread{
	public void run() {
        for (int i =1000; i < 1100; i++) {
            System.out.println(i);
        }
	}
}




