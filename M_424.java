package com.company;



public class M_424 {

    public static void main(String[] args) {

    }
    public int characterReplacement(String s, int k) {
        int m=k;
        int st=0,en=0,max=Integer.MIN_VALUE;
        while (en<s.length()){
            if(s.charAt(st)==s.charAt(en)){
                max=Math.max(max,en-st+1);
                en++;
            }
            else if(s.charAt(st)!=s.charAt(en) && m>0){
                max=Math.max(max,en-st+1);
                en++;m--;
            }
            else{
                st++;
                en=st;
                m=k;
            }
        }
        return max;






    }
}
