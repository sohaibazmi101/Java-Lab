package Week_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques5 {
    public static void main(String[] args) {
        String fileName = "exampleFile.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            while ((bufferedReader.readLine()) != null) {
                lineCount++;
            }
            System.out.println("Total number of lines in the file: " + lineCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
