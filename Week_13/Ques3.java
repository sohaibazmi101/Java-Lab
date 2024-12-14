package Week_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ques3 {
    public static void main(String[] args) {
        String sourceFile = "sourceFile.txt";
        String destinationFile = "destinationFile.txt";
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
