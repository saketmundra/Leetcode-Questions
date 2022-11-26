package com.company;

public class M_1328 {
    public static void main(String[] args) {

    }
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n==1) return "";
        else if(n%2==0){
            for(int i=0;i<n/2;i++){
                if(palindrome.charAt(i)!='a'){
                    return palindrome.substring(0,i)+'a'+palindrome.substring(i+1);
                }
            }}
        else{
            for(int i=0;i<(n/2)+1;i++){
                if(palindrome.charAt(i)!='a'){
                    return palindrome.substring(0,i)+'a'+palindrome.substring(i+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(palindrome.charAt(i)!='a'){
                return palindrome.substring(0,i)+'b'+palindrome.substring(i+1);
            }
        }

        return "";

    }
}
