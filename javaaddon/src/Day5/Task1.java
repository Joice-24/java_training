package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Joice");
        students.add("kani");
        students.add("sadha");

        Iterator<String> it = students.iterator();
        System.out.println("List of Students:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
