package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class H_60 {
    public static void main(String[] args) {

    }
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer> nos=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            nos.add(i);
        }
        nos.add(n);
        k=k-1;
        String ans="";
        while (true){
            int i1=k/fact;
            int i2=k%fact;
            ans=ans+nos.get(i1);
            nos.remove(i1);
            k=i2;
            if(nos.size()==0){
                break;
            }
            fact=fact/nos.size();
        }
        return ans;




    }


}
