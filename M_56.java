package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class M_56 {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        //sorting array on the basis of 2 collumns inc

        ArrayList<int []> list=new ArrayList<>();
        for(int [] interval :intervals){ //traversing over sorted intervals
            if(list.size()==0){
                list.add(interval);
            }
            else {
                int [] pre=list.get(list.size()-1);//getting previous interval
                if(interval[0]<=pre[1]) {
                    pre[1]=Math.max(pre[1],interval[1]);
                }
                else {
                    list.add(interval);
                }
            }

        }
    return list.toArray(new int[list.size()][]);
    }


}
