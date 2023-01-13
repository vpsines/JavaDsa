package Maths;

public class GCD_LCM {
    public static void main(String[] args) {

    }

    // euclidean theorem
    static int gcd(int a,int b){
        if(a==0){
            return  b;
        }
        return  gcd(b%a,a);
    }

    static  int LCM (int a, int b){
        return  a*b/ gcd(a,b);
    }
}
