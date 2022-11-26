package com.company;

public class M_2470 {
    public static void main(String[] args) {

    }
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public int subarrayLCM(int[] nums, int k) {
        int subarr=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==k)subarr++;
            int lc=nums[i];
            for(int j=i+1;j< nums.length;j++){
                lc=lcm(lc,nums[j]);
                if(lc==k)subarr++;
                else break;
            }
        }
        return subarr;
    }
}
