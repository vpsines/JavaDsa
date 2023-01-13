package Recursion.Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println(subsetReturnAsList("","cda"));
    }

    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subsetReturnAsList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }

        ArrayList<String> right = subsetReturnAsList(p+up.charAt(0),up.substring(1));
        ArrayList<String> left = subsetReturnAsList(p,up.substring(1));
        right.addAll(left);
        return  right;
    }
}
