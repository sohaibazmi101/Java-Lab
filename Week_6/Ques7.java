package Week_6;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        int n, data;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter array element at "+(i + 1)+" : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter Data to search : ");
        data = scanner.nextInt();
        scanner.close();
        for(int i = 0; i < n; i++){
            if(array[i] == data){
                System.out.println(data+" found at "+(i+1));
                return;
            }
        }
        System.out.println(data+" Not Found");
    }
}
