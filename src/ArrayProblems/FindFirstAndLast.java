package ArrayProblems;

import java.util.Arrays;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 4, 7, 8};
        int[] ans = findFirstAndLast(a, 4);
//        int ans = findPos(a,4,true);

        System.out.println(Arrays.toString(ans));
//        System.out.println(ans);

    }

    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = findPos(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = findPos(arr, target, false);
        }

        return ans;
    }

    public static int findPos(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid +1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }
}
