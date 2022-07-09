package com.company;

public class E_231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%2==0)
            return isPowerOfTwo(n/2);
        else
            return false;

    }



}
