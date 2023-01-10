package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class M_1388 {
    public static void main(String[] args) {

    }
    public int maxSizeSlices(int[] slices) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<slices.length;i++){
            arr.add(slices[i]);
        }
        return solve(arr,0);
    }
    int solve(ArrayList<Integer> arr,int size){
        int n=arr.size();
        if(n==3){
            return size+Math.max(Math.max(arr.get(0),arr.get(1)),arr.get(2));
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr=arr.get(i);
            if(i==0){
                ArrayList temp = (ArrayList<Integer>)arr.clone();
                temp.remove(0);temp.remove(0);temp.remove(temp.size()-1);
                max=Math.max(max,solve(temp,size+curr));
            }
            else if(i==n-1){
                ArrayList temp = (ArrayList<Integer>)arr.clone();
                temp.remove(0);temp.remove(temp.size()-1);temp.remove(temp.size()-1);
                max=Math.max(max,solve(temp,size+curr));
            }
            else{
                ArrayList temp = (ArrayList<Integer>)arr.clone();
                temp.remove(i);temp.remove(i);temp.remove(i-1);
                max=Math.max(max,solve(temp,size+curr));
            }
        }
        return max;
    }
}
