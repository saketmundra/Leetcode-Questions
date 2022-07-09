package com.company;

public class M_686 {
    public static void main(String[] args) {

    }
    public int repeatedStringMatch(String a, String b) {
        int n=a.length();
        int m=b.length();
        int s=0;
        int ans=0;
        if(!a.equals(b.substring(0,n))) ans++;
        if(!a.equals(b.substring(m-n,n))) ans++;
        while(s<=m-n){
            if(a.equals(b.substring(s,s+n))){
                ans++;
                s+=n;
            }
            else s++;
        }
        return ans;


    }
}
