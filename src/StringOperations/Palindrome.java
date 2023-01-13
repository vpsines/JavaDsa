package StringOperations;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null ||str.length() ==0  ){
            return true;
        }
        int start = 0;
        int end = str.length() -1;

        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start = start +1;
            end =end -1;
        }
        return true;
    }
}
