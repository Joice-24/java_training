package opps;

import java.util.Scanner;

public class OOPSClass {
	public static void main(String[] args) {
		
		EncapsulationClass user = new EncapsulationClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Email:");
		user.setEmail(sc.next().toLowerCase());
		
		System.out.print("Enter the user name:");
		user.setusername(sc.next().toLowerCase());
		
		System.out.print("Enter the mobile");

		
		System.out.print("Enter the Age:");
	
		
		System.out.print("Enter the gender");
		user.setGender(sc.next().charAt(0));
		
		System.out.print("Enter the graduate:");
		
		
		
		System.out.println(user.getEmail());
		System.out.println(user.getUsername());
		System.out.println(user.getMobile());
		System.out.println(user.getage());
		System.out.println(user.getGender());
		System.out.println(user.getgraduate());
		System.out.println(user.getDate());
		
		
		
	}
}
