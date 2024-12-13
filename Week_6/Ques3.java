package Week_6;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int n, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array elements at "+(i +1)+" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        temp = array[0];
        array[0] = array[n - 1];
        array[n - 1] = temp;
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
