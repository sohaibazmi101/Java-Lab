package Week_7;

import java.util.Scanner;

public class Ques2 {
    public static void sort(int array[], int n){
        int temp;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter array Size : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array elements at index "+i +" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        sort(array, n);
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
