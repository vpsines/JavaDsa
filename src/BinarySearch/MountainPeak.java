package BinarySearch;

public class MountainPeak {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // in the descending part
                end = mid;
            } else {
                // in the ascending part
                start = mid + 1; // because element[mid + 1] > element[mid]
            }
        }

            // finally, start and end will point to largest no because  of above 2 checks
            // start and end always tries to find max element
            // when they are pointing to one element, that is max element
            // more elaboration : at every point of time for start and end , they have the best possible answer
            return  start; // return or end
        }



        // search in peak array
    public int searchInMountainArray(int[] arr,int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry != -1){
            return  firstTry;
        }else{
            return  orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int target,int start, int end){
        int ans = -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans =  mid;
            }

            if(isAsc){
                if( target < arr[mid]) {
                    end = mid -1;
                }else{
                    start = mid + 1 ;
                }
            }else{
                if ( target > arr[mid]) {
                    end = mid -1;
                }else{
                    start = mid + 1 ;
                }
            }
        }

        return  ans;
    }

}
