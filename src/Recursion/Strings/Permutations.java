package Recursion.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationsList("","acd"));
        System.out.println(permutationsCount("","abcdf"));
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList();
        char ch = up.charAt(0);

        for (int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i=0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count += permutationsCount(f+ch+s,up.substring(1));
        }

        return count;
    }
}


