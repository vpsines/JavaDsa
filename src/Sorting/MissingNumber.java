package Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println( missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        // search for missing no
        for(i=0; i<nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
