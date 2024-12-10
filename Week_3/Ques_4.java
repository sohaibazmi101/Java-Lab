package Week_3;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        int a, b, c;
        double avg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = scanner.nextInt();
        System.out.print("Enter First Number : ");
        b = scanner.nextInt();
        System.out.print("Enter First Number : ");
        c = scanner.nextInt();
        scanner.close();
        avg = (double)( a + b + c ) / 3;
        System.out.println("Average of number is : "+avg);
    }
}
