package com.company;

public class M_309 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {

        int obsp=-prices[0];
        int ossp=0;
        int ocsp=0;

        for(int i=0;i<prices.length;i++){

            int nbsp=0;
            int nssp=0;
            int ncsp=0;

            //working for bsp
            if(ocsp-prices[i]>obsp){
                nbsp=ocsp-prices[i];
            }
            else {
                nbsp=obsp;
            }

            //working on ssp
            if(prices[i]-obsp>ossp){
                nssp=prices[i]-obsp;
            }
            else {
                nssp=ossp;
            }

            //working on csp
            if(ossp>ocsp){
                ncsp=ossp;
            }
            else {
                ncsp=ocsp;
            }

            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        return ossp;

    }




}
