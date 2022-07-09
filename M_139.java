package com.company;
import java.util.*;
public class M_139 {
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> words = new HashSet<String>();
        for(int i=0;i<wordDict.size();i++){
            words.add(wordDict.get(i));
        }
        String temp="";
        for(int i=0;i<s.length();i++){
            temp+=s.charAt(i);
            if(words.contains(temp)){
                temp="";
                if(words.contains(s.substring(i+1))){
                    return true;
                }

            }
            System.out.println(temp);
        }
        return temp.isEmpty();

    }
}
