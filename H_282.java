package com.company;
import java.util.*;

public class H_282 {
    public static void main(String[] args) {

    }
    public List<String> addOperators(String num, int target) {
        int []nos=new int [num.length()];
        for(int i=0;i<num.length();i++){
            nos[i]=num.charAt(i)-'0';
        }
        ans(nos,0,target,0,"");
        return answer;
    }
    List<String> answer=new ArrayList<>();
    public void ans(int[]nos,int idx,int target,int val,String s){
        if(idx==nos.length){
            if(val==target){
                answer.add(s);
                return;
            }
            else return;
        }

        ans(nos,idx+1,target,val+nos[idx],s+"+"+nos[idx]);
        ans(nos,idx+1,target,val-nos[idx],s+"-"+nos[idx]);
        ans(nos,idx+1,target,val*nos[idx],s+"*"+nos[idx]);
        return;
    }
}
