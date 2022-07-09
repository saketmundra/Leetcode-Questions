package com.company;

public class E_202 {
    public static void main(String[] args) {
        Boolean sr=isHappy(100);
        System.out.println(sr);

    }
    public static boolean isHappy(int n) {
        while(n!=0 && n!=7){
            int m=0;
            while(n!=0){
                m+=(n%10)*(n%10);
                n=n/10;
            }
            n=m;
            if(n==1||n==7){
                return true;
            }

        }
        return false;
    }
}
