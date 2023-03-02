package SearchProblems;

public class kthMissing {

    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};
        System.out.println(findKthMissing(arr,
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

}
