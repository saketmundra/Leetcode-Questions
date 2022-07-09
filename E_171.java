package com.company;

public class E_171 {
    public static void main(String[] args) {

    }
    public int titleToNumber(String columnTitle) {
        //64
        int ans = 0;
        int s = 1;
        for(int i=columnTitle.length()-1;i>=0;i--) {
            ans += (columnTitle.charAt(i) - 'A' + 1) * s;
            s *= 26;
        }
        return ans;


    }
}
