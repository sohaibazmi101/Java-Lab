package Week_5;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = scanner.nextInt();
        scanner.close();
        if(n < 0){
            System.out.println("Negative number not allowed!!");
            return;
        }
        if(n == 0 || n == 1){
            System.out.println("Factorial of "+n+" is : "+fact);
            return;
        }
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
