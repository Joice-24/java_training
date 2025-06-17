package Day5;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Joice", 80);
        marks.put("kani", 90);
        marks.put("sadha", 70);

        int total = 0;
        for (int score : marks.values()) {
            total += score;
        }

        double average = (double) total / marks.size();

        System.out.println("Student Marks:");
        for (String name : marks.keySet()) {
            System.out.println(name + ": " + marks.get(name));
        }

        System.out.println("Average Marks: " + average);
    }
}