package com.company;

public class M_729 {
    public static void main(String[] args) {

    }
    public int numMatchingSubseq(String s, String[] words) {
        int [][] dp=new int[words.length][s.length()];
        int ans=0;
        for(int i=0;i<words.length;i++){
            int h=0;
            for(int j=0;j<s.length();j++){
                if(h==words[i].length()){
                    break;
                }
                if(words[i].charAt(h)==s.charAt(j)){
                    h++;
                }
            }
            if(h==words[i].length()){
                ans++;
            }
        }
        return ans;
    }
}
