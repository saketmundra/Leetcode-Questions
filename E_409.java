package com.company;

import java.util.*;

public class E_409 {
    Integer y=new Integer(78);
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(hs.containsKey(ch)){
                int j=hs.get(ch);
                if(j%2==0){
                    ans+=j;
                    hs.remove(ch);
                }
                else if(j!=1){
                    ans+=j-1;
                    hs.put(ch,1);
                }
            }
        }
        return hs.size()>0?ans+1:ans;


    }
}
