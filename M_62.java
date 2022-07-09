package com.company;

public class M_62 {
    public static void main(String[] args) {

    }
    public int uniquePaths(int m, int n) {
        if(m==1 &&n==1){
            return 1;
        }
        int [][] arr= new int[m][n];
        for(int i=m;i>=0;i--){
            for(int j=n;j>=0;j--){
                if(i==m && j==n){
                    arr[i][j]=0;
                }
                else if(i==m){
                    arr[i][j]=1;
                }
                else if(j==n){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i+1][j]+arr[i][j+1];
                }

            }
        }
        return arr[0][0];

    }
}
