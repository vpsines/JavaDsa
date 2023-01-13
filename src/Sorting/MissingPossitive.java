package Sorting;

public class MissingPossitive {

    // IGNORE NEGATIVES AND GREATER THAN N

    // START CHECKING FROM 1
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println( firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        // search for missing no
        for(i=0; i<nums.length; i++){
            if(i + 1!= nums[i]){
                return i +1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
