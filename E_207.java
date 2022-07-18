package com.company;

import java.util.HashMap;
import java.util.HashSet;

/**
 * E_207
 */
public class E_207 {
    public static void main(String[] args) {
        
    }
    public boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> hs=new HashMap<>();
        HashSet<Character>hm=new HashSet<>();
        for(int i=1;i<s.length();i++){
            if(hs.isEmpty()){
                hs.put(s.charAt(i),t.charAt(i));
                hm.add(t.charAt(i));
            }
            if(!hs.containsKey(s.charAt(i))){
                if(hm.contains(t.charAt(i))) return false;
                hs.put(s.charAt(i),t.charAt(i));
                hm.add(t.charAt(i));
            }
            else{
                if(hs.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

        }
        return true;
        

        
    }
    
}