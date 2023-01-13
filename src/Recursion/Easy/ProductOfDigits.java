package Recursion.Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(12345));
    }

    static int productOfDigits(int n){
        if(n / 10 == 0){
            return  n;
        }
        return  (n%10) * productOfDigits(n/10);
    }
}
