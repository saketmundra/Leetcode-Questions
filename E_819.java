package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class E_819 {
    public static void main(String[] args) {

    }
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        System.out.println(paragraph);
        paragraph=paragraph.substring(0,paragraph.length()-1);
        System.out.println(paragraph);

        String [] arr=paragraph.split(" ");
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            hs.add(banned[i]);
        }
        HashMap<String,Integer>hss=new HashMap<>();
        int max=0;
        String ans="";
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                if(!hss.containsKey(arr[i])){
                    hss.put(arr[i],1);
                    max=Math.max(1,max);
                    ans=arr[i];
                }
                else {
                    int a=hss.get(arr[i]);
                    a++;
                    hss.put(arr[i],a);
                    if(a>max){
                        max=a;
                        ans=arr[i];
                    }

                }

            }
        }
        return ans;

    }
}
