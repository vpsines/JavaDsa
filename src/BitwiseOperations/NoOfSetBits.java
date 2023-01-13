package BitwiseOperations;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 16;

        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;

        while( n>0){
            count++;
            n -= (n & -n);
        }

        return  count;
    }

    static int setBits2(int n){
        int count = 0;

        while( n>0){
            count++;
            n = n & (n-1);
        }

        return  count;
    }
}
