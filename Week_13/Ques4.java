package Week_13;

import java.io.FileReader;
import java.io.IOException;

public class Ques4 {
    public static void main(String[] args) {
        String fileName = "exampleFile.txt";
        try (FileReader fileReader = new FileReader(fileName)) {
            int characterCount = 0;
            while ((fileReader.read()) != -1) {
                characterCount++;
            }
            System.out.println("Total number of characters in the file: " + characterCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
