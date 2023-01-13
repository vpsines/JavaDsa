package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {

        int[] arr = {1,2,33,44,55,66,66,64,6,222};

        System.out.println(noOfEvenDigits(arr));
    }

    static int noOfEvenDigits(int[] arr){
        int count = 0;
        for(int i : arr){
            if(checkEvenDigits(i)){
                count++;
            }
        }
        return count;
    }

    static boolean checkEvenDigits(int num){
        int count = 0;
        while(num >0){
            count++;
            num=num/10;
        }
        return count % 2 == 0;
    }
}
