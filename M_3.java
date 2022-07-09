package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class M_3 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int max=0;
        int st=0;
        int end=0;
        while(end<s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
            }
            else{
                max=Math.max(max,end-st);
                while(s.charAt(st)!=s.charAt(end) && st<=end){
                    hs.remove(s.charAt(st));
                    st++;
                }
                st++;
                end++;
            }
        }
        max=Math.max(max,end-st);
        return max;

    }
}
