package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,44,5,6,7,5};
        System.out.println(linearSearchRev(a,44,a.length-1));
        findAllIndex(a,5,0);
        System.out.println(indexes);
        System.out.println(findIndexesWithArrayList(a,5,0,new ArrayList<>()));
        System.out.println(findIndexesWithArrayListInBody(a,5,0));

    }

    static int linearSearch(int[] arr,int element,int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == element){
            return  index;
        }
        return linearSearch(arr,element,index+1);
    }

    static boolean findIndex(int[] arr,int element,int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == element || findIndex(arr,element,index+1);
    }

    static int linearSearchRev(int[] arr,int element,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == element){
            return  index;
        }
        return linearSearchRev(arr,element,index-1);
    }

    static ArrayList<Integer> indexes = new ArrayList();

    static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            indexes.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> findIndexesWithArrayList(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndexesWithArrayList(arr,target,index+1,list);
    }

    static ArrayList<Integer> findIndexesWithArrayListInBody(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans = findIndexesWithArrayListInBody(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
