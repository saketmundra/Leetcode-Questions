package com.company;

public class E_125 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", ""); //Removes all alphanumeric values
        s = s.trim(); // removes white spaces
        s=s.toLowerCase(); // converts to  lower
        return isPalindrome2(s,0,s.length()-1);
    }
    public static boolean isPalindrome2(String s,int i,int j) {
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
