package SearchProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
      int[]  nums1 = {4,9,5};
      int[] nums2 = {9,4,9,8,4};

      int[] ans = intersection2(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        for(int i=0; i< nums1.length; i++)
        {
            set1.add(nums1[i]);
        }

        Set<Integer>  ans = new HashSet();
        for (int j=0; j<nums2.length; j++){
            if(set1.contains(nums2[j])){
                ans.add(nums2[j]);
            }
        }

        int[] res = new int[ans.size()];
        int j=0;
        for(Integer i : ans){
            res[j] = i;
            j++;
        }

        return res;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;

        while (i < nums1.length && j <nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] res = new int[ans.size()];
        i=0;
        for(Integer a : ans){
            res[i] = a;
            i++;
        }

        return res;
    }
}
