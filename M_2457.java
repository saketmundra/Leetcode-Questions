package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class M_2457 {
    public static void main(String[] args) {

    }
    public long makeIntegerBeautiful(long n, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            arr.add((int)n%10);
            n=n/10;
        }
        Collections.reverse(arr);
        if(arr.get())




    }
    public long makearrLong(ArrayList<Integer> arr){
        long a=0;
        for(int i=0;i<arr.size();i++){
            a+=arr.get(i)*Math.pow(10,arr.size()-i-1);
        }
        return a;
    }
}
