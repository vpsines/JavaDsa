package BitwiseOperations;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(findNoOfDigits(6,2));
    }

    static int findNoOfDigits(int n,int base){
        return (int)(Math.log(n)/Math.log(base)) + 1;
    }
}
