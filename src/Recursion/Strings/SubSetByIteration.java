package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetByIteration {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        List<List<Integer>> out = subsetDuplicates(arr);
        for (List<Integer> i:out){
            System.out.println(i);
        }
    }

    // time complexity O(n x 2^n)
    // space complexity O(n x 2^n)

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans = new ArrayList();
        // add empty list with no elements
        ans.add(new ArrayList<>());
        // we already have elements without num
        // so add the ones with num to the original
        for(int num:arr){
            int l = ans.size();
            for (int i=0;i<l;i++){
                List<Integer> inside = new ArrayList<>(ans.get(i));
                inside.add(num);
                ans.add(inside);
            }
        }
        return ans;
    }

    static List<List<Integer>> subsetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList();
        // add empty list with no elements
        ans.add(new ArrayList<>());
        // we already have elements without num
        // so add the ones with num to the original
        int start = 0;
        int end = 0;

        for(int i=0; i < arr.length;i++){
            start = 0;
            // if current and prev elements are same, start =end +1
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = ans.size() -1;
            int l = ans.size();
            for (int j=start;j<l;j++){
                List<Integer> inside = new ArrayList<>(ans.get(j));
                inside.add(arr[i]);
                ans.add(inside);
            }
        }
        return ans;
    }
}
