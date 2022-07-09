package com.company;
import java.util.*;

public class M_151 {
    public static void main(String[] args) {
        String j="     hello world     ";
        System.out.println(reverseWords(j));
    }
    public static String reverseWords(String s) {
//        ArrayList<String> words = new ArrayList<String>();
        String k="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(k==""){}
                else{
                    ans=" "+k+ans;
                    k="";
                }

            }
            else k=k+s.charAt(i);
        }
        ans=k+ans;

        return ans.charAt(0)==' '?ans.substring(1,ans.length()):ans.substring(0,ans.length());

    }
}
