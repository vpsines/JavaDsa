package SearchProblems;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(findSqrt(2147395599));
    }

    public static int findSqrt(int num){    // 7 7
        long start = 0;
        long end = num;
        long mid = 0;

        while(start <= end){
            mid  = start + (end -start)/2;
            if(mid * mid == num){
                return (int)mid;
            }else if(mid * mid > num){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }

        return  (int)start -1;
    }
}
