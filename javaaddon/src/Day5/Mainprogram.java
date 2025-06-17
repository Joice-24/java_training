package Day5;

import java.util.*;

public class Mainprogram {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Course Enrollment System ---");
            System.out.println("1. Add Student with Courses");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students and Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);

                    ArrayList<String> courses = new ArrayList<>();
                    System.out.print("How many courses to add? ");
                    int count = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter course " + (i + 1) + ": ");
                        courses.add(scanner.nextLine());
                    }
                    studentCourses.put(name, courses);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    if (students.remove(removeName)) {
                        studentCourses.remove(removeName);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Student List with Courses ---");
                    Iterator<String> it = students.iterator();
                    while (it.hasNext()) {
                        String student = it.next();
                        System.out.println("Student: " + student);
                        System.out.println("Courses: " + studentCourses.get(student));
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
