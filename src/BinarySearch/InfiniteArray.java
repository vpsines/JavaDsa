package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,33,44,55,66,66,67,76,222};

        System.out.println(findRange(arr,222));
    }

    static int findRange(int[] arr, int target){
        int start =0;
        int end =1;

        // condition for target to lie in the range
        while(target > arr[end]){
            int newStart = end +1;
            // double the box size
            end = end +(end - start + 1)*2;
            start = newStart;
        }

        return  binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target,int start, int end){
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans =  mid;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  ans;
    }

    static int search(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans =  mid;
            } else if ( target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1 ;
            }
        }
        return  ans;
    }
}
