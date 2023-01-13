package ArrayProblems;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        plusOne(arr);
    }

    static int[] plusOne(int[] digits) {
        int carry =0;
        for(int i=digits.length -1;i>=0;i--){
            digits[i] = digits[i] +1 + carry;
            if(digits[i] >9){
                carry = digits[i]/ 10;
                digits[i] %= 10;
            }else{
                return digits;
            }
        }
        if(carry > 0){
            int[] ans = new int[digits.length+1];
            ans[0] = carry;
            int j=1;
            for(int i=0;i< digits.length-1;i++){
                ans[j] = digits[i];
                j++;
            }
            return ans;
        }
        return digits;
    }
}
