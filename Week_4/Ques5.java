package Week_4;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a NUmber : ");
        n = scanner.nextInt();
        scanner.close();
        System.out.println("Entered Number is : "+n);
        if(n < 10){
            System.out.println("Number is Less than 10");
        }
        else{
            while (n > 10) {
                n = n / 2;
                System.out.println("Number is : "+n);
            }
        }
    }
}
