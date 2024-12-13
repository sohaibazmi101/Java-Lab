package Week_7;

import java.util.Scanner;

public class Ques1 {
    public static int binarySearch(int array[], int n, int data){
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == data){
                return mid;
            }else if(array[mid] < data){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void sort(int array[], int n){
        int temp;
        for(int i = 1; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n, data;
        Scanner sacnner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = sacnner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array Elements at "+(i + 1)+" : ");
            array[i] = sacnner.nextInt();
        }
        sort(array, n);
        System.out.print("Enter data to be searched : ");
        data = sacnner.nextInt();
        sacnner.close();
        int result = binarySearch(array, n, data);
        if(result != -1){
            System.out.println("Data Found at index : " +result);
        }else{
            System.out.println("Data Not found!");
        }
    }
}
