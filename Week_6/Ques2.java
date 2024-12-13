package Week_6;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n = scanner.nextInt();
        scanner.close();
        if(n < 0){
            System.out.println("Negative number is not allowed!!!!");
            return;
        }
        else if(n == 0 || n == 1){
            System.out.println(n+" is Not a Prime Number!!!");
            return;
        }
        if(n == 2){
            System.out.println(n+" is Prime Number!!!");
            return;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n+" is not Prime Number!!");
                return;
            }
        }
        System.out.println(n+" is Prime Number!!!");
    }
}
