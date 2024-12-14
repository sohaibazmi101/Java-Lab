package Week_12;

import java.io.IOException;

public class Ques2 {

    public static void functionA() {
        try {
            functionB();
        } catch (IOException e) {
            System.out.println("Exception handled in functionA: " + e.getMessage());
        }
    }
    public static void functionB() throws IOException {
        functionC();
    }
    public static void functionC() throws IOException {
        throw new IOException("IOException occurred in functionC");
    }
    public static void main(String[] args) {
        functionA();
    }
}
