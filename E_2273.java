package com.company;
import java.util.*;

public class E_2273 {
    public static void main(String[] args) {

    }
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<String>();
        HashSet<String > hs=new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()==1){
                result.add(words[i]);
            }
            if(!hs.contains(sorted(words[i]))){
                hs.add(sorted(words[i]));
                result.add(words[i]);
            }
        }
        return result;

    }
    public String sorted(String s){
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
