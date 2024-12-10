package Week_3;

import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter Two Float NumberS : ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        scanner.close();
        c = a * b;
        System.out.println("Product is : "+c);
    }
}
