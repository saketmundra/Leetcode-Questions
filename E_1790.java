package com.company;

public class E_1790 {
    public static void main(String[] args) {

    }
    public boolean areAlmostEqual(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                int j=i;
                while (s2.charAt(i)!=s1.charAt(j)){
                    j++;
                }
                System.out.println(s1.charAt(j)+s1.substring(i+1,j)+s1.charAt(i));
            }
        }
        return false;
    }
}
