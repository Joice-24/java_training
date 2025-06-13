package Thread;

public class RunningClass {
	public static void main(String[]args) {
		ThreadClass tc = new ThreadClass(); //object
		Thread tc1 = new Thread(tc);
		tc1.start();
		
		ThreadClass2 tc2 = new ThreadClass2();
		tc2.start();
			try {
				tc1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("Program completed");
	}
}
