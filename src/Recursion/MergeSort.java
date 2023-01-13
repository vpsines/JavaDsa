package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={1,5,67,71,14,2,3,18};
        System.out.println(Arrays.toString(mergeSort(arr)));

        int[] arr2 ={1,5,67,71,14,2,3,18};
        mergeSortWithIndex(arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }

        int mid = arr.length /2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){

        int[] sorted = new int[first.length+second.length];
        int i =0;
        int j=0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                sorted[k] = first[i];
                i++;
            }else {
                sorted[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible for left over elements
        // add them to sorted if so
        while(i < first.length){
            sorted[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            sorted[k] = second[j];
            j++;
            k++;
        }

        return sorted;
    }

    static void mergeSortWithIndex(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }

        int mid = s + (e-s) /2;

        mergeSortWithIndex(arr,s,mid);
        mergeSortWithIndex(arr,mid,e);

        mergeWithIndex(arr,s,mid,e);
    }

    static void mergeWithIndex(int[] arr, int s,int m,int e){

        int[] mix = new int[e-s];
        int i =s;
        int j=m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible for left over elements
        // add them to sorted if so
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int c =0;c<mix.length;c++){
            arr[s+c] = mix[c];
        };
    }
}
