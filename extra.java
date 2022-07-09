package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class extra {
    public static void main(String[] args) {
        System.out.println(function1("rhythm"));


    }
    public static String function1 (String s){
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        char [] strng=s.toCharArray();
        Arrays.sort(strng);
        String j="";
        String k="";
        int st=0;
        int en=0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(strng[i])){
                j=j+strng[i];
            }
            else {
                k=k+strng[i];
            }
        }
        for(int i=strng.length-1;i>0;i--){
            if(strng[i]==k.charAt(k.length()-1)) {
                en=i-1;
            }
        }

        if(vowels.contains(strng[0])){
            st=s.indexOf(strng[0]);
            return j+st+k+en;
        }
        if(!vowels.contains(strng[0])){
            return "NA-1"+j+k+en;
        }
        return "";

    }
}
