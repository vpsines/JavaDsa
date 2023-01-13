package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerForm {

    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        addToArrayForm3(arr,k);
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        // int carry =0;
        // List<Integer> res = new ArrayList();
        // for(int i = num.length -1; i>=0;i--){
        //     num[i] = num[i]+carry;
        //     if(k>0){
        //     int digit = k % 10;
        //     num[i] = num[i]+digit;
        //     k = k/10;
        //     }
        //     carry = num[i]/10;
        //     res.add(num[i] % 10);
        // }
        // if(carry > 0){
        //     res.add(carry);
        // }
        // Collections.reverse(res);
        // return res;
        int i = num.length-1;
        while(k>0){
            int digit = k % 10;
            num[i] = num[i] + digit;
            k = k/10;
            i--;
        }
        List<Integer> res = new ArrayList();
        int carry = 0;
        for(i = num.length -1; i>=0; i--){
            num[i] = num[i]+ carry;
            res.add(num[i] % 10);
            carry = num[i]/10;
        }
        if(carry >0){
            res.add(carry);
        }

        Collections.reverse(res);
        return res;
    }

    static List<Integer> addToArrayForm2(int[] num, int k) {
        int i = num.length -1;
        long j =1;
        long m = k;
        while(i >=0){
            m= m+ (num[i] * j);
            j = j * 10;
            i--;
        }
        List<Integer> res = new ArrayList();
        j =(int)Math.log10(m);
        while(j>=0){
            long d = (long)Math.pow(10,j);
            long x = m/d;
            res.add((int)x);
            m =m % d;
            j--;
        }
        return res;
    }

    static List<Integer> addToArrayForm3(int[] num, int k) {

        List<Integer> ans = new ArrayList();

        int i = num.length -1;
        while(k>0 || i>=0){
            if(k>0 && i>=0){
                k += num[i];
                ans.add(k%10);
                k=k/10;
                i--;
            }else if(i>=0){
                ans.add(num[i]);
                i--;
            }else{
                ans.add(k%10);
                k = k/10;
            }
        }
        return ans;
    }
}
