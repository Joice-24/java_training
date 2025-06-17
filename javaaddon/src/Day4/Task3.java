package Day4;

import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello World");
            writer.write("This is line");
            writer.write("This is line");
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
