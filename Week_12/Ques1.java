package Week_12;

public class Ques1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                int result = 10 / (i - 2);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: ArithmeticException occurred. " + e.getMessage());
            }
        }
    }
}
