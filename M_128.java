package com.company;

import java.util.HashMap;

public class M_128 {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] arr) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int val:arr){
            map.put(val,true);
        }
        int ml=0;
        for(int val:arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
            else{
                int tl=1;
                int tsp=val;
                while(map.containsKey(tsp+1)){
                    tl++;
                    tsp++;
                }
                ml=Math.max(tl,ml);
            }
        }
        return ml;
    }
}
