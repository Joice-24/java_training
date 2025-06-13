package opps;

public class Task1 {
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void displayPerson() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
    static class Employee extends Person {
        double basicSalary;
        Employee(String name, int age, double basicSalary) {
            super(name, age);  
            this.basicSalary = basicSalary;
        }
        double calculateSalary() {
            double hra = 0.1 * basicSalary; 
            double da = 0.05 * basicSalary;  
            return basicSalary + hra + da;           
            }
        void displayEmployee() {
            displayPerson(); 
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Total Salary: " + calculateSalary());
            
        }
        public static void main(String[] args) {
           
            Employee emp = new Employee("Joice", 19, 20000);
            Employee emp1  = new Employee ("charu",29,80000);
            emp.displayEmployee(); 
            emp1.displayEmployee(); 
        }
    }
}
