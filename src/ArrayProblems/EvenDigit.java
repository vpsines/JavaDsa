package ArrayProblems;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {252};
        findNumbers(arr);
    }

    static int findNumbers(int[] nums) {
        int count =0;
        for(int n:nums){
            if( (int)(Math.log10(n) +1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
