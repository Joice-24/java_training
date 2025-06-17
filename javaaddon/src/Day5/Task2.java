package Day5;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("joice@gmail.com");
        emails.add("kani@gmail.com");
        emails.add("joice@gmail.com"); 

        System.out.println("Unique Email Addresses:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}