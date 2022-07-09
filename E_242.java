package com.company;

import java.util.HashMap;

public class E_242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));

    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                int a=hs.get(s.charAt(i));
                a++;
                hs.put(s.charAt(i),a);
                System.out.println(hs.size());
            }
            else{
                hs.put(s.charAt(i),1);
            }
        }
        System.out.println(hs.size());
        for(int i=0;i<t.length();i++){
            if(!hs.containsKey(t.charAt(i)))return false;
            else if(hs.get(t.charAt(i))==1){
                hs.remove(t.charAt(i));
            }
            else{
                int a=hs.get(t.charAt(i));
                a--;
                hs.put(t.charAt(i),a);
            }
        }
        System.out.println(hs.size());
        return hs.size()==0;






    }
}
