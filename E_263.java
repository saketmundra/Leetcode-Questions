package com.company;

public class E_263 {
    public static void main(String[] args) {

    }

    public boolean isUgly(int n) {
//        if(n==1) return true;
//        else if(n%2!=0 && n%3!=0 && n%5!=0){
//            return false;
//        }
//        else if(n%2==0) isUgly(n/2);
//        else if(n%3==0) isUgly(n/3);
//        else if(n%5==0) isUgly(n/5);
//        return false;
        boolean ans=true;
        while(n!=1){
            if(n%2!=0 && n%3!=0 && n%5!=0){
              ans=false;
              break;
            }
            else if(n%2==0) n=n/2;
            else if(n%3==0) n=n/3;
            else if(n%5==0) n=n/5;
        }
        return ans;
    }
}
