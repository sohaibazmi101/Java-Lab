package Week_4;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(a+ " x " +i+ " = " +a*i);
        }
    }
}
