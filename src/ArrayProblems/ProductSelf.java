package ArrayProblems;

import java.util.Arrays;

public class ProductSelf {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        int[] b = productExceptSelf2(a);

        for(int i=0; i< b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // calculate left for each element
        for(int i=0; i< nums.length; i++){
              if(i==0){
                  left[0] = 1;
              }else{
                  left[i] = left[i-1] * nums[i-1];
              }
        }

        // calculate for right side of each element
        for(int i=nums.length-1; i>= 0; i--){
            if(i==nums.length-1){
                right[nums.length-1]= 1;
            }else{
                right[i] = right[i+1] * nums[i+1];
            }
        }

        // calculate product of left and right
        for(int i=0; i<nums.length ; i++){
            ans[i] = left[i] *right[i];
        }
        return  ans;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];

        Arrays.fill(ans,1);
        int current = 1;

        // calculate left for each element
        for(int i=0; i< nums.length; i++){
            ans[i] = current;
            current = current * nums[i];
        }

        current = 1;
        // calculate for right side of each element
        for(int i=nums.length-1; i>= 0; i--){
            ans[i] = ans[i] * current;
            current = current * nums[i];
        }

        return  ans;
    }
}
