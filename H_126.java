package com.company;
import java.util.*;

public class H_126 {
    public static void main(String[] args) {

    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        String let="abcdefghijklmnopqrstuvwxyz";
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            hs.add(wordList.get(i));
        }
        Queue<ArrayList<String>> qs=new LinkedList<>();
        ArrayList<String> arr=new ArrayList<>();
        arr.add(beginWord);
        qs.add(arr);
        ArrayList<String> used=new ArrayList<>();
        used.add(beginWord);
        int level=0;
        List<List<String>> ans=new ArrayList<>();

        while (!qs.isEmpty()){
            ArrayList<String> vec=qs.poll();
            if(vec.size()>level){
                level++;
                for(String it:used){
                    hs.remove(it);
                }
            }
            String word=vec.get(vec.size()-1);
            if(word.equals(endWord)){
                if(ans.size()==0)ans.add(vec);
                else if(ans.get(0).size()==vec.size())ans.add(vec);
            }
            for(int i=0;i<word.length();i++){
                for(int j=0;j<let.length();j++) {
                    String ch=word.substring(0,i)+let.charAt(j)+word.substring(i+1);
                    if(hs.contains(ch)){
                        vec.add(ch);
                        ArrayList<String> temp=new ArrayList<>(vec);
                        qs.add(temp);
                        used.add(ch);
                        vec.remove(vec.size()-1);
                    }
                }
            }
        }
        return ans;


    }
}
