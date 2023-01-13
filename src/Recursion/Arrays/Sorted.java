package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] a = {1,2,3,6,5};
        System.out.println(isSorted(a,0));
    }

    static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index +1] && isSorted(arr,index+1);
    }
}
