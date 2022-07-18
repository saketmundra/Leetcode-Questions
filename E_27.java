package com.company;

/**
 * E_27
 */
public class E_27 {
    public static void main(String[] args) {
        
    }
    public int removeElement(int[] nums, int val) {
        if(nums.length==1 && nums[0]==val){
            return 0;
        }
        int n=0;
        int st=0;
        int en=nums.length-1;
        while(st<=en){
            if(nums[st]!=val){
                st++;
            }
            else if(nums[en]==val){
                n++;
                en--;
            }
            else if(nums[st]==val && nums[en]!=val){
                nums[st]=nums[en];
                n++;
                st++;
                en--;
            }
            
        }
        return (nums.length-n);
    }
    
}
