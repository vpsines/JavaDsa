package Recursion;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        solution("",4);
        System.out.println(diceWithList("",4));
    }

    static void solution(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target;i++){
            solution(p+i,target-i);
        }
    }

    static ArrayList<String> diceWithList(String p,int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=6 && i<=target;i++){
            ans.addAll(diceWithList(p+i,target-i));
        }

        return ans;
    }
}
