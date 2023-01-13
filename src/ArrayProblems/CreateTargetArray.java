package ArrayProblems;

public class CreateTargetArray {
    public static void main(String[] args) {
            int[] arr = {0,1,2,3,4};
            int[] arr1 = {0,1,2,2,1};
            createTargetArray(arr,arr1);
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i=0; i< nums.length; i++){
            target[i] = -1;
        }

        for(int i = 0; i< nums.length; i++){
            if(target[index[i]] != -1 ){
                swap(target,nums[i],index[i]);
            }else{
                target[index[i]] = nums[i];
            }
        }

        return target;
    }

    static void swap(int[] arr,int val,int start){
        for(int i =arr.length -1;i > start; i--){
            arr[i] = arr[i-1];
        }
        arr[start] = val;
    }
}
