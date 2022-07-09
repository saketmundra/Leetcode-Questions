package com.company;
import java.util.*;

public class M_739 {
    //array approach
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        for(int i=0; i<len; i++){
            int count = 0;
            for(int j=i+1; j<len; j++){
                if(temperatures[j] > temperatures[i]){
                    count = j - i;
                    break;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    //faster stack approach
    public int[] dailyTemperatures1(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i=0; i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
