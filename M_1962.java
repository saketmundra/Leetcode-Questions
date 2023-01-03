package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class M_1962 {
    public static void main(String[] args) {

    }
    public int minStoneSum(int[] piles, int k) {
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i< piles.length;i++){
            pq.add(piles[i]);
        }
        while(!pq.isEmpty() && k-->0){
            int x=pq.poll();
            int a=x-(int)Math.floor(x/2);// divide the element and add again to queue
            pq.add(a);
        }
        while (!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;

    }
}
