package com.company;

public class E_590 {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        boolean m=Character.isUpperCase(word.charAt(0));
        int lc=0;
        for(int i=1;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                lc++;
            }
        }
        if(lc==word.length()-1)return true;
        if(m==true && lc==0) return true;
        return false;
    }
}
