package com.company;

public class M_45 {
    public static void main(String[] args) {

    }
    static int omin;
    public int jump(int[] nums) {
        omin=Integer.MAX_VALUE;
        int[] visited=new int [nums.length];
        recur(nums,0,visited,0);
        return omin;
    }
    public void recur(int []nums,int idx,int [] visited,int min){
        if(idx==nums.length-1){
            omin=Math.min(min,omin);
            return;
        };
        if(visited[idx]==1) return;
        visited[idx]=1;
        for(int i=1;i<=nums[idx] && idx+i<nums.length;i++){
            recur(nums,idx+i,visited,min+1);
            System.out.println("called"+idx);
        }
        return;
    }
}
