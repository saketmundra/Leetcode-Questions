package com.company;
import java.util.*;

public class M_131 {
    public static void main(String[] args) {

    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        if(s.length()==1) {
            List<String> a=new ArrayList<>();
            a.add(s);
            ans.add(a);
            return ans;
        }
        partitions(s,"",ans);
        return ans;
    }
    public void partitions(String left,String right,List<List<String>> ans) {
        if(isPalindrome(left) && isPalindrome(right)){
            List<String> n=new ArrayList<>();
            n.add(left);
            n.add(right);
        }
        char ch=left.charAt(left.length()-1);
        partitions(left.substring(0,left.length()-1),ch+right,ans);
    }
    public boolean isPalindrome(String s){
        int i=0; int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;
    }
}
