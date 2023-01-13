package Sorting;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int correctIndex = nums[i] -1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
