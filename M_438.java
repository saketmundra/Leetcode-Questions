package com.company;
import java.util.*;

public class M_438 {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()) return ans;
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> copy=new HashMap<>();
        for(int i=0;i<p.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            copy.put(p.charAt(i),copy.getOrDefault(p.charAt(i),0)+1);
        }
        if(hs.equals(copy)) ans.add(0);
        for(int i=p.length();i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            int u=hs.get(s.charAt(i-p.length()));
            if(u==1) hs.remove(s.charAt(i-p.length()));
            else hs.put(s.charAt(i-p.length()),u-1);
            if(hs.equals(copy)) ans.add(i-p.length()+1);
        }
        return ans;


    }
}
