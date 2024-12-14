package Week_10;

class MinMaxAdd{
    public static void minMaxAdd(int a, int b) {
        System.out.println("Integers - Min: " + Math.min(a, b) + ", Max: " + Math.max(a, b) + ", Sum: " + (a + b));
    }
    public static void minMaxAdd(double a, double b) {
        System.out.println("Real Numbers - Min: " + Math.min(a, b) + ", Max: " + Math.max(a, b) + ", Sum: " + (a + b));
    }
    public static void minMaxAdd(char a, char b) {
        char min = (char) Math.min(a, b);
        char max = (char) Math.max(a, b);
        int sum = a + b;
        System.out.println("Characters - Min: " + min + ", Max: " + max + ", Sum: " + sum);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        MinMaxAdd.minMaxAdd(10, 20);
        MinMaxAdd.minMaxAdd(5.5, 2.3);
        MinMaxAdd.minMaxAdd('A', 'Z');
    }
}
