package Week_13;

import java.io.File;
import java.io.IOException;

public class Ques1 {
    public static void main(String[] args) {
        String fileName = "newFile.txt";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
