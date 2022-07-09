package com.company;

public class M_714 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices, int fee) {

        int obsp=-prices[0];
        int ossp=0;

        for(int i=1;i<prices.length;i++){
            int nbsp=0;//new buy state profit
            int nssp=0;//new sold state profit

            //working on buy state profit

            if(ossp-prices[i]>obsp){
                nbsp=ossp-prices[i];
            }
            else {
                nbsp=obsp;
            }

            //working on sold state profit

            if(prices[i]+obsp-fee>ossp){
                nssp=prices[i]+obsp-fee;
            }
            else {
                nssp=ossp;
            }

            //changing states at the last
            obsp=nbsp;
            ossp=nssp;

        }
        return ossp;

    }
}