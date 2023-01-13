package BitwiseOperations;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{1,2,1,2,4,5,5}));
    }



    // find odd one in the array
    // XOR all the nos

    static int findUnique(int[] arr){
        int unique = 0;
        for (int n: arr){
            unique ^= n;
        }

        return unique;
    }
}
