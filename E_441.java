package com.company;

public class E_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins1(8));

    }
    public static int arrangeCoins1(int n) {
        if(n==1){
            return 0;
        }

        int rows=0;
        int k=1;
        while (n>k){
            n=n-k;
            rows++;
            k++;
        }
        return rows;
    }


}
