package Week_4;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        a = scanner.nextInt();
        scanner.close();
        if(a % 2 == 0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+ " is Odd");
        }
    }
}
