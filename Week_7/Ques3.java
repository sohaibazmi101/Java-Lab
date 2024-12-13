package Week_7;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Original String : ");
        str = scanner.nextLine();
        scanner.close();
        String temp = "";
        for(int i = str.length() - 1; i >= 0; i--){
            temp = temp + str.charAt(i);
        }
        System.out.println("String : "+temp);
    }
}
