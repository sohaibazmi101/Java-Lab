package Week_7;

import java.util.Scanner;

public class Ques6 {

    public static int fib_recursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib_recursion(n - 1) + fib_recursion(n - 2);
    }

    public static void fibonacci(int n){
        int a = 0, b = 1, c;
        if(n >= 1){
            System.out.print(a+" ");
        }
        if(n >= 2){
            System.out.print(b+" ");
        }
        for(int i = 3; i <= n; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        int n, choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Series : ");
        n = scanner.nextInt();
        System.out.println("1. For Recursion");
        System.out.println("2. For Without Recursion");
        System.out.print("Enter Your Choice : ");
        choice = scanner.nextInt();
        scanner.close();
        if(n <= 0){
            System.out.println("Enter number greater than 0");
        }else{
            if(choice == 1){
                System.out.print("Series : ");
                for(int i = 0; i < n; i++){
                    System.out.print(fib_recursion(i)+" ");
                }
            }if(choice == 2){
                System.out.print("Series : ");
                fibonacci(n);
            }
        }

    }
}
