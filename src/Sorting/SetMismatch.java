package Sorting;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println( findErrorNums(arr));
    }

    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correctIndex = nums[i] -1;
            if( nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        // search for missing no
        for(i=0; i<nums.length; i++){
            if(i+1 != nums[i]){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
