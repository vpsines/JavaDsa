package BinarySearch;

public class RotatedBS {

    public static void main(String[] args) {
        int[] arr = {7,8,9,10,1,2,3,4,5,6};
        System.out.println(search(arr,1));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length -1);
        }

        if(nums[pivot] == target){
            return  pivot;
        }

        if(target >= nums[0]){
            return  binarySearch(nums,target,0,pivot-1);
        }

        return  binarySearch(nums,target,pivot+1,nums.length -1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // 4 cases

            if( mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return  mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        // pivot not found
        return  -1;
    }

    static int findPivotWithDuplicateValues(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // 4 cases

            if( mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return  mid-1;
            }

            // if elements at middle,start and end are equal, then skip duplicates
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // skip duplicates

                // NOTE: what if these elements at start and end where pivot
                // check if end is pivot
                if(arr[start] > arr[start+1]){
                    return  start;
                }
                start++;

                // check if end is pivot
                if(arr[end] < arr[end-1]){
                    return  end -1;
                }
                end--;
                // left side is sorted so pivot should be in right
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] > arr[mid])) {
                 start = mid +1;
            }else{
                end = mid-1;
            }
        }
        // pivot not found
        return  -1;
    }

    static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return   mid;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  -1;
    }
}

