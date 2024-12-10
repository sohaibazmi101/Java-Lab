package Week_4;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Sum of 1 + 2 + 3 + ......... + N");
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Series : ");
        n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <=n; i++){
            sum += i;
        }
        System.out.println("Sum of Series is : "+sum);
    }
}
