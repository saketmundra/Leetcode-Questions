package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class M_1781 {
    public static void main(String[] args) {

    }
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] charFreq = new int[26];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                charFreq[c - 'a']++;
                sum += beautySum(charFreq);
            }
        }
        return sum;
    }
    private int beautySum(int[] charFreq) {
        int max =0;
        int min = Integer.MAX_VALUE;
        for (int i : charFreq) {
            if (i != 0) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
        }
        return max - min;
    }
    long substrCount (String S, int K) {
        if(K==1) return S.length();
        HashSet<Character> hs=new HashSet<>();
        long ans=0;
        for(int i=0;i<S.length();i++){
            hs.add(S.charAt(i));
            for(int j=i+1;j<S.length();j++){
                hs.add(S.charAt(j));
                if(hs.size()==K)ans++;
            }
            hs.remove(S.charAt(i));
        }
        return ans;
    }
}
