package BitwiseOperations;

public class OddOrEven {

    public static void main(String[] args) {
    int n = 67;
        System.out.println(checkOddOrEven(66));
    }

    static boolean checkOddOrEven(int n){
        return (n & 1) == 1;
    }

    // find odd one in the array
    // XOR all the nos


}
