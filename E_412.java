package com.company;
import java.util.ArrayList;
import java.util.List;

public class E_412 {
    public static void main(String[] args) {

    }
    public List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i+1%3==0 && i+1%5==0){
                ans.add(i,"FizzBuzz");
            }
            if(i+1%3==0 ){
                ans.add(i,"Fizz");
            }
            if(i+1%5==0){
                ans.add(i,"Buzz");
            }
            else{
                ans.add(i,""+i);
            }
        }
        return ans;

    }
}
