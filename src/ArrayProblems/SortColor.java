package ArrayProblems;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors3(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static int[] sortColors2(int[] nums) {
        return mergeSort(nums);
    }

    public static void sortColors3(int[] nums) {
        int mid =0;
        int low=0;
        int high =nums.length-1;
        int temp =0;

        while(mid <= high){
            if(nums[mid] == 0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else{
                temp   = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return  merge(left,right);

    }

    public  static  int[] merge(int[] a,int[] b){
        int[] sorted = new int[a.length + b.length];

        int k =0;
        int i=0;
        int j=0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                sorted[k] = a[i];
                i++;
            }else{
                sorted[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length){
            sorted[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length){
            sorted[k] = b[j];
            j++;
            k++;
        }

        return  sorted;
    }
}
