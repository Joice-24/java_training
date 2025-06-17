package Day4;

public class Task1 {
	
	    public static void main(String[] args) {
	        int a = 10, b = 0;

	        try {
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero.");
	        }
	    }
}
