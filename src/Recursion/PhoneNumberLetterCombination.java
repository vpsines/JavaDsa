package Recursion;

import java.util.ArrayList;

public class PhoneNumberLetterCombination {
    public static void main(String[] args) {
    combination("","12");    }

    static void combination(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // get the digit
        int digit = up.charAt(0) - '0';

        // iterate for the characters wrt the digit
        for(int i = (digit -1) *3;i < digit*3;i++){
            char ch = (char) ('a'+i);
            // recursion call
            combination(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> combinationWithList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for(int i = (digit -1) *3;i < digit*3;i++){
            char ch = (char) ('a'+i);
            ans.addAll(combinationWithList(p+ch,up.substring(1)));
        }

        return ans;
    }

    static int combinationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for(int i = (digit -1) *3;i < digit*3;i++){
            char ch = (char) ('a'+i);
            count += combinationCount(p+ch,up.substring(1));
        }
        return count;
    }
}
