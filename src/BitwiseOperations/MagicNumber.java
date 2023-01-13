package BitwiseOperations;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(findMagicNumber(1));
    }



    //  5
    //

    static int findMagicNumber(int n){
        int ans = 0;
        int base =5;
        while( n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += base * last;
            base = base *5;
        }
        return  ans;
    }
}
