package Week_6;

public class Ques6 {
    public static void main(String[] args) {
        int n = 3;
        boolean isPrime;
        System.out.println("Prime Number Between 1 to 100");
        System.out.print(2+" ");
        while (n < 100) {
            isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(n+" ");
            }
            n++;
        }
        System.out.println();
    }
}
