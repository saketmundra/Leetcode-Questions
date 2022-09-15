package com.company;
import java.util.*;


public class M_167 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int [] ans=new int [2];
        for(int i=0;i<numbers.length;i++){
            if(hs.containsKey(target-numbers[i])){
                ans[1]=i+1;
                ans[0]=hs.get(target-numbers[i]+1);
                return ans;
            }
            else if(!hs.containsKey(numbers[i])){
                hs.put(numbers[i],i);
            }
        }
        return ans;


    }
}
