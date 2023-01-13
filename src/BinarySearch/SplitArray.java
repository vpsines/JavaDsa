package BinarySearch;

public class SplitArray {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i =0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end = end + nums[i];
        }

        while (start < end){
            // try mid as potential ans
            int mid = start + (end-start)/2;

            // calculate how many pieces you can divide this in which max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    pieces++;
                    sum = num;
                }else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid +1 ;
            }else {
                end = mid;
            }
        }

        return end; // here start == end
    }
}

