package Week_3;

import java.util.Scanner;

public class Ques_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the first Number : ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        b = scanner.nextInt();
        c = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+c);
        scanner.close();
    }
}