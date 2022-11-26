package com.company;

import java.util.HashMap;

public class M_791 {
    public static void main(String[] args) {

    }
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        String ex="";
        for(int i=0;i<order.length();i++){
            hs.put(order.charAt(i),0);
        }
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(hs.containsKey(ch)){
                hs.put(ch,hs.getOrDefault(ch,1)+1);
            }
            else ex+=ch;
        }
        String ans="";
        for(int i=0;i<order.length();i++){
            Character ch=order.charAt(i);
            if(hs.get(ch)>0){
                for(int j=0;j<hs.get(ch);j++){
                    ans+=ch;
                }
            }
        }
        return ans+ex;

    }
}
