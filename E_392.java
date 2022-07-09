package com.company;

public class E_392 {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        //s=abc
        //t=ahbgdc
        if(s.isEmpty()) return false;

         int a=0;
         for(int i=0;i<t.length();i++){
             char ch=s.charAt(a);
             if(ch==t.charAt(i)){
                 a++;
             }
             if(a>=s.length()){
                 return true;
             }
         }
         return false;





    }
}
