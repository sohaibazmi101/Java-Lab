package Week_5;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        N = scanner.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter Array at "+(i+1)+" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print("Array : ");
        for(int i = 0; i < N; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
