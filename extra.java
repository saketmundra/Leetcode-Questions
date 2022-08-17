package com.company;

import java.util.*;

public class extra {
    public static void main(String[] args) {
        System.out.println(function1("rhythm"));


    }
    public int[] numberOfPairs(int[] nums) {
        HashSet hs=new HashSet();
        int [] ans=new int[2];
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                pairs++;
                hs.remove(nums[i]);
            }
        }
        ans[0]=pairs;
        ans[1]=hs.size();
        return ans;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> hs=new HashMap<Integer,ArrayList<Integer>>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            System.out.println(getsum(nums[i]));
            if(!hs.containsKey(getsum(nums[i]))){
                ArrayList<Integer> n=new ArrayList<>();
                n.add(nums[i]);
                hs.put(getsum(nums[i]),n);
            }
            else{
                ArrayList<Integer> test =hs.get(getsum(nums[i]));
                for(int j=0;j<test.size();j++){
                    max=Math.max(max,test.get(j)+nums[i]);
                }
                test.add(nums[i]);
                hs.put(getsum(nums[i]),test);

            }
        }
        return max;
    }
    private int getsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }






    public static String function1 (String s){
        HashSet<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        char [] strng=s.toCharArray();
        Arrays.sort(strng);
        String j="";
        String k="";
        int st=0;
        int en=0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(strng[i])){
                j=j+strng[i];
            }
            else {
                k=k+strng[i];
            }
        }
        for(int i=strng.length-1;i>0;i--){
            if(strng[i]==k.charAt(k.length()-1)) {
                en=i-1;
            }
        }

        if(vowels.contains(strng[0])){
            st=s.indexOf(strng[0]);
            return j+st+k+en;
        }
        if(!vowels.contains(strng[0])){
            return "NA-1"+j+k+en;
        }
        return "";

    }
}
