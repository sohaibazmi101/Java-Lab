package Week_7;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Original String : ");
        str = scanner.nextLine();
        scanner.close();
        for(int i = 0; i < (str.length() - 1)/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
                System.out.println(str + "is Not Palindrome!!");
                return;
            }
        }
        System.out.println(str+" is Palindrome!!");
    }
}
