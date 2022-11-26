package com.company;
import java.util.*;

public class M_57 {
    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>list=new ArrayList<>();
        int i=0;
        boolean sr=false;
        for(int [] interval :intervals){
            if(interval[1]>newInterval[0] && sr==false){
                interval[0]=Math.min(interval[0],newInterval[0]);
                interval[1]=Math.max(interval[1],newInterval[1]);
                sr=true;
            }
            if(i==0){
                list.get(i)[0]=interval[0];
                list.get(i)[1]=interval[1];
                i++;
            }
            else {
                int [] pre=list.get(i-1);
                if(interval[0]<=pre[1]) {
                    pre[1]=Math.max(pre[1],interval[1]);
                }
                else {
                    list.get(i)[0]=interval[0];
                    list.get(i)[1]=interval[1];
                    i++;
                }
            }
        }
//        int [][] ans=new int[list.size()][2];
//        for(int j=0;j<list.size();j++){
//            ans[j][0]=list.get(j)[0];
//            ans[j][1]=list.get(j)[1];
//
//        }
        int [][] ans=new int[list.size()][2];
        for(int j=0;j<list.size();j++){
            ans[j]=list.get(j);
        }
//        return ans;
        return ans;

    }
}
