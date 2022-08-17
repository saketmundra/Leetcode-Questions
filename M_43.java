package com.company;

public class M_43 {
    public static void main(String[] args) {

    }
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return num1;
        long n1=val(num1);
        long n2=val(num2);
        long ans=n1*n2;
        System.out.println(ans);
        String ans1="";
        while (ans>0){
            ans1=(ans%10)+ans1;
            ans=ans/10;
        }
        return ans1;

    }
    static long val(String s){
        int n=s.length();
        long val=0;
        int k=1;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            val+=(ch-48)*k;
            k=k*10;
        }
        return val;
    }
}
