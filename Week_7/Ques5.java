package Week_7;

import java.util.Scanner;

public class Ques5 {

    public static int factorial(int n){
        if(n < 0){
            System.out.println("Negative number not Allowed");
            return -1;
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = scanner.nextInt();
        scanner.close();
        int f = factorial(n);
        if(f == -1){
            return;
        }
        System.out.println("Factorial : "+f);
    }
}
