package com.company;

import java.util.*;

public class M_1048 {
    public static void main(String[] args) {

    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put(words[0],1);
        int max=1;
        for(int i=1;i<words.length;i++){
            hs.put(words[i],1);

            for (int j = 0; j < words[i].length(); j++) {
                String s = words[i].substring(0,j) + words[i].substring(j + 1);
                if (hs.containsKey(s)) {
                    hs.put(words[i],Math.max(hs.get(s)+1,hs.get(words[i])));
                    max = Math.max(max,hs.get(words[i]));

                }
            }
        }
        return max;

    }

}
