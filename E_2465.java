package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class E_2465 {
    public static void main(String[] args) {

    }
    public int distinctAverages(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> rq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            rq.add(nums[i]);
        }
        System.out.println(pq);
        HashSet<Double> hs=new HashSet<>();
        for(int i=0;i< nums.length/2;i++){
            double a=(pq.poll()+rq.poll());
            hs.add(a/2);
        }
        return hs.size();


    }
}
