package com.company;

public class E_509 {
    public static void main(String[] args) {

    }
    class Solution_Tabular {
        public int fib(int n) {
            int [] arr= new int [n+1];
            if(n==0){
                return 0;
            }
            else if(n==1){
                return 1;
            }
            else{
                arr[0]=0;
                arr[1]=1;
                for(int i=2;i<n+1;i++){
                    arr[i]=arr[i-1]+arr[i-2];
                }
                return arr[n];
            }


        }
    }
    class Solution_Recurr {
        public int fib(int n) {
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }

            int fib1=fib(n-1);
            int fib2=fib(n-2);
            int res=fib1+fib2;
            return res;
        }
    }
    class Solution_RecurrM {
        public int fib(int n) {
            if(n==0|| n==1){
                return n;
            }else {
                int dp[] = new int[n+1];
                return memo(n,dp);
            }
        }
        public int memo(int n, int dp[]){
            if(n == 0 || n == 1){
                return n;
            }
            if(dp[n] != 0){
                return dp[n];
            }

            int a = memo(n-1,dp) + memo(n-2,dp);
            dp[n] = a;

            return a;
        }
    }


}
