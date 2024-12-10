package Week_3;

import java.util.Scanner;
import java.lang.Math;

public class Ques_5 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1 : ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        System.out.print("Enter x2, y2 : ");
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        scanner.close();
        distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println("Distance is : " + distance);
    }
}
