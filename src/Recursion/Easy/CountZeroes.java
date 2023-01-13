package Recursion.Easy;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(1200,0));
    }

    static int countZeroes(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%10==0){
            return countZeroes(n/10,count+1);
        }else{
            return countZeroes(n/10,count);
        }
    }
}
