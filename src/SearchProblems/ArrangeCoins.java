package SearchProblems;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins4(14));
    }

    public static int arrangeCoins(int n) {
        int count =0;
        int i =1;
        while(n >0){
            if(n-i >= 0){
                count++;
            }
            n = n-i;
            i++;

        }
        return count;
    }

    public static int arrangeCoins2(int n) {
        for(int i=1; i >0; i++){
            if(n-i < 0){
                return i-1;
            }
            n = n-i;
        }
        return -1;
    }

    public static int arrangeCoins3(int n) {
        return (int)Math.floor((Math.sqrt(8l*n + 1) + 1)/2) - 1;
    }

    public static int arrangeCoins4(int n) {
        int l =0;
        int h = n;
        while(l <= h){
            int m = l + (h-l)/2;
            if(n == m*(m+1)/2) {
                return m;
            } else if (n > m*(m+1)/2) {
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return l-1;
    }
}
