package SearchProblems;

public class kthMissing {

    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};

        // 2 3 4 7 11
        // 0 1 2 3 4
        System.out.println(findKthMissing2(arr,
                5));
    }

    public static int findKthMissing(int[] arr,int k){
        int i=1;
        int j=0;
        while(k>0){
            if(j < arr.length && arr[j] == i){
                j++;
            }else{
                k--;
            }
            i++;
        }
        return i-1;
    }

    public static int findKthMissing2(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while (low <= high){
            mid = low + (high-low)/2;
            if(arr[mid] - (mid +1) >= k){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low+k;
    }
}
