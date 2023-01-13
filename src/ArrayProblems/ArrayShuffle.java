package ArrayProblems;

public class ArrayShuffle {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        shuffle(arr,4);
    }
    static int[] shuffle(int[] nums, int n) {
        int j =n;
        for(int i=1;i < 2*n -1;i =i+2){
            swap(nums,i,j);
            for(int k= j; k >= i+2; k--){
                swap(nums,k,k-1);
            }
            j++;
        }
        return nums;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
