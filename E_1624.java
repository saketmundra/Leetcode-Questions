package com.company;

import java.util.HashMap;

public class E_1624 {
    public static void main(String[] args) {

    }
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),i);
            }
            else{
                max=Math.max(max,hs.get(s.charAt(i))-i-1);
            }
        }
        return max!=0?max:-1;


    }
}
