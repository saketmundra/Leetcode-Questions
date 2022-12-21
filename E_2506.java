package com.company;

import java.util.*;

public class E_2506 {
    public static void main(String[] args) {

    }
    public int similarPairs(String[] words) {
        boolean [] test=new boolean[words.length];
        Arrays.fill(test,false);
        int pairs=0;
        for(int i=0;i<words.length-1;i++){
            if(test[i]==true)continue;
            HashSet<Character> hs=new HashSet<>();
            for(int j=0;j<words[i].length();j++){
                hs.add(words[i].charAt(j));
            }

            test[i]=true;
            int ans=0;
            for(int j=i+1;j<words.length;j++){
                if(test[j]==true)continue;
                HashSet <Character> temp=new HashSet<>();
                for(int k=0;k<words[j].length();k++){
                    if(temp.add(words[j].charAt(k)));
                }
                if(temp.equals(hs)){
                    ans+=(ans==0?1:ans*2);
                    test[j]=true;
                }
            }
            pairs+=ans;
        }
        return pairs;


    }

}
