package com.company;

import java.util.*;

public class H_295 {
    public static void main(String[] args) {

    }
    class MedianFinder {
        ArrayList<Double> arr=new ArrayList<>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            arr.add((double)num);
            Collections.sort(arr);
        }

        public double findMedian() {
            int n=arr.size();
            if(n%2!=0){
                return arr.get(n/2);
            }
            else{
                return (arr.get(n/2)+arr.get((n/2)-1))/2;
            }

        }
    }
}
