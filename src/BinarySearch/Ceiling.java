package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,33,44,54,67,88,99};
       int[] nums = {1,3,5,6};
       int target = 2;
       int result = floor(arr,0);
       System.out.println(searchInsert(nums,2));
    }

    // return index of smallest no greater than or equal to target
    static int ceiling(char[] arr, int target){

        // if target is greater than greates no in the array
        if(arr[arr.length-1] < target){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return  mid;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  start;
    }

    // return index of greatest no less than or equal to target
    static int floor(int[] arr, int target){

        // if target is smaller than the smallest no in the array

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return  mid;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  end;
    }

    // return  smallest character greater than or equal to target
    static int nextGreatestCharacter(char[] letters, int target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if ( target < letters[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  letters[start % letters.length];
    }


    // find pos of first and last of target in a array
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]= start;
        ans[1] = end;
        return  ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans =  mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  ans;
    }

    // insert pos
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end =nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid] ){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return start;
    }
}
