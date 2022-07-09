package com.company;
import java.util.*;

public class M_49 {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
//        if(strs.length==1){
//            List<String> ns=new ArrayList<>();
//            ns.add(strs[0]);
//
//        }

        HashMap<String,Integer> hs=new HashMap<>(); //string,index
        int j=0;
        for(int i=0;i<strs.length;i++){
            String temp=sorted(strs[i]);
            if(!hs.containsKey(temp)){
                hs.put(temp,j);
                List<String> ns=new ArrayList<>();
                ns.add(strs[i]);
                ans.add(ns);
                j++;
            }
            else{
                ans.get(hs.get(temp)).add(strs[i]);
            }
        }
        return ans;

    }
    public String sorted(String s){
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
