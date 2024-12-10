package Week_5;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array at "+(i + 1)+" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i = 0; i < n; i++){
            sum += array[i];
        }
        System.out.println("Sum of Array is : "+sum);
    }
}
