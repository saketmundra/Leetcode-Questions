package com.company;

public class M_518 {
    public static void main(String[] args) {

    }
    public int change(int amount, int[] coins) {
        //coin change combinations-values cant repeat
        int [] dp=new int[amount+1];
        int n=coins.length;
        dp[0]=1;

        for(int i=0;i<n;i++){//bahar wale loop me coins chalenge
            for(int j=i;j<=amount;j++){//andar wale loop me amount chalega
                dp[j]+=dp[j-coins[i]];//dp me jo value thi+dp[dp-coinvalue]
            }

        }
        return dp[amount];





    }
}
