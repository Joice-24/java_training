package Controller;

import java.util.Scanner;

public class ClinicController {
	boolean isAct = true;
    Scanner scanner = new Scanner(System.in);
    public void clinicControl() {
    	
        while(isAct) {
        System.out.println("Enter the clinic detail you want to get:");
        System.out.println("1 - Clinic Name");
        System.out.println("2 - Clinic Address");
        System.out.println("3 - Clinic Contact Number");
        System.out.println("4 - Clinic Working Hours");
        System.out.print("Choose an option (1-4): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.println("Clinic Name: Healthy Life Clinic");
                break;
            case 2:
                System.out.println("Clinic Address: 123 Wellness Blvd, Healthy City");
                break;
            case 3:
                System.out.println("Clinic Contact Number: +1-555-123-4567");
                break;
            case 4:
                System.out.println("Clinic Working Hours: 9 AM - 5 PM, Mon to Fri");
                break;
            default:
                System.out.println("Invalid choice. Please select 1 to 4.");
                break;
        }
      
    }
        scanner.close();
    }
  
}