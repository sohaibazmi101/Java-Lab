package Week_6;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        int n, max, min;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array Elements at "+(i + 1)+" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        max = array[0];
        min = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Largest Element is : "+max);
        System.out.println("Smallest Element is : "+min);
    }
}
