package com.company;

public class M_96 {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        int num=factorial(2*n);
        int den=factorial(n+1)* factorial(n);
        return num/den;

    }
    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
