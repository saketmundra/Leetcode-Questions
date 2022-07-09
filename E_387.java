package com.company;


import java.util.HashMap;

public class E_387 {
    public static void main(String[] args) {


    }
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                int a=hs.get(s.charAt(i));
                a++;
                hs.put(s.charAt(i),a);
            }
            else{
                hs.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(hs.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;




    }
}
