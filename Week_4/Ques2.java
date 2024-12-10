package Week_4;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = scanner.nextInt();
        System.out.print("Enter b : ");
        b = scanner.nextInt();
        System.out.print("Enter c : ");
        c = scanner.nextInt();
        scanner.close();
        if(a > b && a > c){
            System.out.println(a+" is Greatest");
        }else if (b>a && b>c) {
            System.out.println(b+" is Greatest");
        }else{
            System.out.println(c+" is Greatest");
        }
    }
}
