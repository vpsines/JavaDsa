package Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }

    static int sumOfDigits(int n){
        if(n / 10 == 0){
            return  n;
        }
        return  (n%10) + sumOfDigits(n/10);
    }
}
