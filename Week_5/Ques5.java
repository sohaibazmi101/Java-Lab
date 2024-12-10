package Week_5;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        int n;
        int remainder, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = scanner.nextInt();
        scanner.close();
        if(n < 0){
            System.out.println("Negative number is not allowed!!");
            return;
        }
        while (n != 0) {
            remainder = n % 10;
            n = n / 10;
            sum += remainder;
        }
        System.out.println("Sum of Digit is : "+sum);
    }
}
