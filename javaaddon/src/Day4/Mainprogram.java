package Day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mainprogram {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int total = 0; // stores the total marks of students

                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i].trim());
                }

                double avg = total / (parts.length - 1.0);
                writer.write(name + " - Total: " + total + ", Average: " + String.format("%.2f", avg));
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
