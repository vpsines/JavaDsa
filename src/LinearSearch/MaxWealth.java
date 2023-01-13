package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr2 = {
                {1,2,3,4,5},
                {6,7,8},
                {9,10,11,12,13,14}};
        System.out.println(maxWealth(arr2));
    }

    static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int max1 = 0;
            for(int account = 0; account < accounts[person].length; account++){
                max1 += accounts[person][account];
            }
            if(max1 > max){
                max = max1;
            }
        }
        return  max;
    }
}
