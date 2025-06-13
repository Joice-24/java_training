package opps;

public class Task3 {

    
    class Overload {

        int sum(int a, int b) {
            return a + b;
        }
        double sum(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Task3 task = new Task3();  
        
        Overload calc = task.new Overload();

        System.out.println("Sum of integers: " + calc.sum(23, 45));
        System.out.println("Sum of doubles: " + calc.sum(238.7, 56.2));
    }
}
