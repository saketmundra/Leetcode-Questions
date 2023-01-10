package com.company;
import java.util.*;

public class M_1358 {
    public static void main(String[] args) {

    }
    public int numberOfSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> hs=new HashSet<>();
            hs.add('a');hs.add('b');hs.add('c');
            for(int j=0;j<s.length();j++){
                Character ch=s.charAt(j);
                if(hs.contains(j))hs.remove(ch);
                if(hs.isEmpty()){
                    ans+=s.length()-j-i;
                    break;
                }
            }

        }
        return ans;
        

    }
}
