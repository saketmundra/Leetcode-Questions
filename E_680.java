package com.company;

import javax.imageio.stream.ImageInputStream;

public class E_680 {
    public static void main(String[] args) {



    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(isPalindrome(s,i+1,j)==true || isPalindrome(s,i,j-1)==true){
                    return true;
                }
            }
            i++;
            j--;
        }
        return false;
    }

    public static boolean isPalindrome(String s,int i,int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

}
