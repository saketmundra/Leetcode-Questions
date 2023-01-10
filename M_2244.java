package com.company;

import java.util.HashMap;

public class M_2244 {
    public static void main(String[] args) {

    }
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        HashMap<Integer,Integer> copy=new HashMap<>();
        for(int it:tasks){
            hs.put(it,hs.getOrDefault(it,0)+1);
        }
        copy.putAll(hs);
        int cnt=0;
        for(int it:hs.keySet()){
            cnt+=hs.get(it)/3;
            hs.put(it,hs.get(it)%3);

            cnt+=hs.get(it)/2;
            hs.put(it,hs.get(it)%2);
        }
        for(int it:hs.keySet()){
            if(hs.get(it)==1 && copy.size()>3){
                cnt+=1;
            }
            else if(hs.get(it)!=0){
                return -1;
            }
        }
        return cnt;


    }
}
