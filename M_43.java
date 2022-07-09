package com.company;

public class M_43 {
    public static void main(String[] args) {

    }
    public String multiply(String num1, String num2) {
        int n1=val(num1);
        int n2=val(num2);
        int ans=n1*n2;
        return Integer.toString(ans);
    }
    static int val(String s){
        int n=s.length();
        int val=0;
        int k=1;
        for(int i=n;i>0;i--){
            char ch=s.charAt(i);
            val+=(ch-48)*k;
            k=k*10;
        }
        return val;
    }
}
