package LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,77,333,22,32,1,2};

        int[][] arr2 = {
                {1,2,3,4,5},
                {6,7,8},
                {9,10,11,12,13,14}
        };

        int ans = linearSearchRange(arr,77,0,3);
        System.out.println(ans);

        int[] ans2 = linearSearch2DArray(arr2,4);
        System.out.println(Arrays.toString(ans2));
    }

    // search array
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        for(int i=0; i< arr.length; i++){
            int element = arr[i];
            if( element == target){
                return  i;
            }
        }

        return  -1;
    }

    // search array
    static int linearSearchRange(int[] arr, int target,int start, int end){
        if(arr.length == 0){
            return  -1;
        }

        for(int i=start; i< end; i++){
            int element = arr[i];
            if( element == target){
                return  i;
            }
        }

        return  -1;
    }

    static int[] linearSearch2DArray(int[][] arr, int target){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int element = arr[i][j];
                if( element == target){
                    return  new int[]{i,j};
                }
            }
        }
        return  new int[]{-1,-1};
    }
}
