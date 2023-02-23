package ArrayProblems;

public class JumbGame {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length ==1 )
            return true;

        if(nums.length == 2 && nums[0] >0){
            return  true;
        }

        int max = nums[0];
        int length = nums.length-1;

        for(int i=1; i< length; i++){
            if(max == 0){
                return false;
            }
            max = Math.max(max-1,nums[i]);
            if(max >= length - i){
                return true;
            }
        }
        return  false;
    }

}
