package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class M_91 {
    public static void main(String[] args) {

    }
    public int numDecodings(String s) {
        int [] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        decode(arr,0,"");
        return hs.size();
    }
    static HashSet<String> hs=new HashSet<String>();
    private void decode(int[] arr,int i,String s){
        if(i==arr.length-1){
            hs.add(s);
            return;
        }
        if(i<arr.length-1 || arr[i]*10+arr[i+1]<27){
            i++;
            decode(arr,i+1,s+(arr[i]*10+arr[i+1]-'A'));
        }
        decode(arr,i+1,s+(arr[i]-'A'));
    }

}
