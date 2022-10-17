package com.company;
import java.util.*;

public class M_89 {
    public static void main(String[] args) {

    }
    public List<Integer> grayCode(int n) {
        List<String> ans=sol(n);
        List<Integer> ans1=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            ans1.add(Integer.parseInt(ans.get(i),2));
        }
        return ans1;
    }
    public List<String> sol(int n){
        if(n==1){
            List<String> list=Arrays.asList("0","1");
            return list;
        }

        List<String> rres=sol(n-1);
        List<String> ans=new ArrayList<>();

        for(int i=0;i<rres.size();i++){
            String s=""+rres.get(i);
            s="0"+s;
            ans.add(s);
        }
        for(int i=rres.size()-1;i>=0;i--){
            String s=""+rres.get(i);
            s="1"+s;
            ans.add(s);
        }
        return ans;
    }
}
