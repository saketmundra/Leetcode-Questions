package com.company;

import java.util.Arrays;

public class E_14 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return " ";
        String prefix=strs[0];
        for(String s:strs){
            int i=0;
            int j=0;
            while(i<prefix.length() &&j<s.length()&& prefix.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            prefix=s.substring(0,j);
        }
        return prefix;

    }

}
