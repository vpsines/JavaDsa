package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,7,4,3,5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n-1 time
        for(int i=0; i< arr.length;i++){
            swapped = false;
            for(int j=1; j< arr.length -i; j++){
                // swap if item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            // if swap doesn't occur  means array is sorted, then break
            if(!swapped){
                break;
            }
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i= start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return  max;
    }

    static void selectionSort(int[] arr){
        for(int i=0; i < arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
}
