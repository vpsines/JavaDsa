package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,11};
        int ans = binarySearch(arr,9,0,arr.length-1);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target,int start, int end){
        if(start > end){
            return  -1;
        }
        int mid = start + (end - start)/2;

        if(target == arr[mid]){
            return  mid;
        }

        if(arr[mid] > target){
            return  binarySearch(arr,target,start,mid-1);
        }else {
            return  binarySearch(arr,target,mid+1,end);
        }
    }
}
