package com.company;

import java.util.PriorityQueue;

public class M_215 {
    public static void main(String[] args) {

    }
    public int findKthLargest(int[] nums, int k) {
        //making pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(int num : nums){
            //adding nos
            pq.add(num);
            i++;
            if (i > k) pq.remove();
        }
        return pq.peek();
    }
}
