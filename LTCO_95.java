package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class LTCO_95 {
    public static void main(String[] args) {

    }
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulk=false;
        boolean heavy=false;
        if(length>10000 ||width>10000||height>10000 || length*width*height>1000000000){
            bulk=true;
        }
        if(mass>100)heavy=true;
        if(bulk && heavy) return "Both";
        else if(bulk==true && heavy==false) return "Bulky";
        else if(bulk==false && heavy==true)return "Heavy";
        else return "Neither";


    }
    ArrayList<Integer> arr=new ArrayList<>();
    int val=0;
    int l=0;
    ArrayList<Integer> dp=new ArrayList<>();
    public DataStream(int value, int k) {
        val=value;
        l=k;
    }
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(Integer it:nums){
            pq.add(it);
        }
        int score=0;
        while(k>0){
            int it=pq.poll();
            score+=it;
            pq.add((int)Math.ceil((it/3)));
            k--;
        }
        return score;
    }
    public boolean isItPossible(String word1, String word2) {
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            hs1.put(word1.charAt(i),hs1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i=0;i<word2.length();i++){
            hs2.put(word2.charAt(i),hs2.getOrDefault(word2.charAt(i),0)+1);
        }
        if(hs1.size()==hs2.size() && word1.length()>1 && word2.length()>1)return true;


    }
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    public boolean consec(int num) {
        arr.add(num);
        if(num==val && dp.get(dp.size()-1)==1){
            dp.add(1);
            return true;
        }
        if(arr.size()<l){
            dp.add(0);
            return false;//3 3
        }
        for(int j=arr.size()-1;j>=arr.size()-l;j--){
            if(arr.get(j)!=val){
                dp.add(0);
                return false;
            }
        }
        dp.add(1);
        return true;
    }
    public int xorBeauty(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int h;
                String s=""+i+j;
                if(!hs.containsKey(s)){
                    h=(nums[i]|nums[j]);
                    hs.put(s,h);
                }
                else h=hs.get(s);
                for(int k=0;k<n;k++){
                    ans^=h&nums[k];
                }
            }
        }
        return ans;

    }
}
