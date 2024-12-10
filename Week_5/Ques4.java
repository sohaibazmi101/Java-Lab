package Week_5;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        double sum = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = scanner.nextInt();
        scanner.close();
        if(n < 1){
            System.out.println("Invalid Input (Enter n > 0)");
            return;
        }
        for(int i = 1; i <= n; i++){
            sum += (double) 1/i;
        }
        System.out.println("Sum is : "+sum);
    }
}
