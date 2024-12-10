package Week_3;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a = scanner.nextInt();
        scanner.close();
        System.out.println("Cube is : "+ a * a * a);
    }
}
