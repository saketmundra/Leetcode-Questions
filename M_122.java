package com.company;

public class M_122 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int bd=0;
        int sd=0;
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=prices[i-1]){
                sd++;
            }
            else {
                p+=prices[sd]-prices[bd];
                bd=i;
                sd=i;

            }
        }
        p+=prices[sd]-prices[bd];
        return p;

    }
}
