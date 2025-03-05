package src.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list= new ArrayList<>();
        List<List<Integer>> whole= new ArrayList<>();
        Map<Integer,Integer> countMap= new HashMap<>();
        for(int n:nums)
        {
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }
        int n=nums.length;
        backtrack(n,list,whole,countMap);
        return whole;

    }
    public static void backtrack(int n, List<Integer> list, List<List<Integer>> whole,Map<Integer,Integer> countMap)
    {
        if(list.size()==n)
        {
            whole.add(new ArrayList<>(list));
            return;
        }
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet())
        {
            int num=entry.getKey();
            int count=entry.getValue();
            if(count>0)
            {
                list.add(num);
                countMap.put(num,count-1);
                backtrack(n,list,whole,countMap);
                list.remove(list.size()-1);
                countMap.put(num,count);
            }
        }

    }
}