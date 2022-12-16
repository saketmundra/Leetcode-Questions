package com.company;

public class letc {
    public static void main(String[] args) {

    }
    public int[][] onesMinusZeros(int[][] grid) {
        int nor= grid.length;
        int noc=grid[0].length;
        int [] rows=new int[nor];
        int [] cols=new int[noc];
        for(int i=0;i<nor;i++){
            int one=0;
            for(int j=0;j<noc;j++){
                if(grid[i][j]==1)one++;
            }
            rows[i]=one;
        }
        for(int i=0;i<noc;i++){
            int one=0;
            for(int j=0;j<nor;j++){
                if(grid[j][i]==1)one++;
            }
            cols[i]=one;
        }
        int [][] diff=new int[nor][noc];
        for(int i=0;i<nor;i++){
            for(int j=0;j<noc;j++){
                diff[i][j]=rows[i]+cols[j]-((nor-rows[i])-(noc-cols[j]));
            }
        }
        return diff;
    }
    public int bestClosingTime(String customers) {
        int y=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y')y++;
        }
        int min=y;
        int[] ans=new int[customers.length()+1];
        ans[0]=y;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                y--;
            }
            else{
                y++;
            }
            min=Math.min(y,min);
            ans[i]=min;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
            if(ans[i]==min)return i;
        }
        return 0;

    }
    public int countPalindromes(String s) {
        long M = 1000000007;
        long ans = 0;
        int len = s.length();
        long[][] dp = new long[len][len];

        /* compute how many palindromes of length 3 are possible for every 2 characters match */
        for(int i = len - 2;i >= 0; --i){
            for(int j = i + 2; j < len; ++j){
                dp[i][j] = dp[i][j-1] + (dp[i + 1][j] == dp[i + 1][j-1] ? 0 : dp[i + 1][j] - dp[i + 1][j - 1]);
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] += j - i - 1;
                }
            }
        }

        /* re-use the above data to calculate for palindromes of length 5*/
        for(int i = 0; i < len; ++i){
            for(int j = i + 4; j < len; ++j){
                if(s.charAt(i) == s.charAt(j)){
                    ans += dp[i + 1][j - 1];
                }
            }
        }

        //for(int i=0;i<len;++i) System.out.println(Arrays.toString(dp[i]));

        return (int)ans;

    }
}
