package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class M_712 {
    public static void main(String[] args) {

    }
    public int minimumDeleteSum(String s1, String s2) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            hs.put(s1.charAt(i),hs.getOrDefault(s1.charAt(i),0)+1);
        }
        int ans=0;
        for(int i=0;i<s2.length();i++){
            if(hs.containsKey(s2.charAt(i))){
                if(hs.get(s2.charAt(i))==1)hs.remove(s2.charAt(i));
                else hs.put(s2.charAt(i),hs.get(s2.charAt(i))-1);
            }
            else{
                ans+=getValue(s2.charAt(i));

            }
        }
        for(Map.Entry<Character,Integer> it:hs.entrySet()){
            ans+=getValue(it.getKey());
        }
        return ans;
    }
    int getValue(char ch){
        char character = ch;
        return (int) character;
    }
}
