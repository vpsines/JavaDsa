package Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr ={7,8,9,1,2,3};
        System.out.println(rotatedBS(arr,8,0, arr.length-1));
    }

    static int rotatedBS(int[] arr,int target,int start,int end){
        if (start>end){
            return  -1;
        }

        int mid = start + (end -start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return  rotatedBS(arr,target,start,mid-1);
            }else {
                return rotatedBS(arr,target,mid+1,end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]){
            return rotatedBS(arr, target, mid+1, end);
        }
        return rotatedBS(arr, target, start, mid - 1);
    }
}
