package com.company;

public class E_9 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        return isPalindrome(s);
    }
    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
