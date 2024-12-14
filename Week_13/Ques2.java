package Week_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ques2 {
    public static void main(String[] args) {
        String fileName = "exampleFile.txt";
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hello, this is a test file.");
            writer.newLine(); // Adding a new line
            writer.write("This is the second line of the file.");
            writer.newLine(); // Adding another new line
            writer.write("Java file writing example.");
            System.out.println("Data has been written to the file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
