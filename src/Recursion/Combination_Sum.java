package src.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] arr = new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5};
        List<Integer> list = new ArrayList<>();
        System.out.println("What is the sum for which you need the count");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int index = 0;
        int n = arr.length - 1;
        List<List<Integer>> listOfList= combinationSum(arr,x);
        System.out.println(listOfList);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target)
    {
            List<List<Integer>> whole= new ArrayList<>();
            List<Integer> individual= new ArrayList<>();
            int n= candidates.length-1;
            int index=0;
            backtrack(index,candidates,target,n,individual,whole);
            return whole;
    }

    public static void backtrack(int index, int[] candidates , int target, int n, List<Integer> list, List<List<Integer>> whole)
    {
        if(target==0)
        {
            whole.add(new ArrayList<>(list));
            return;
        }
        if(target<0||index>n)
        {
            return;
        }
        list.add(candidates[index]);
        backtrack(index, candidates, target-candidates[index],n,list,whole);
        list.remove(list.size()-1);
        backtrack(index+1,candidates,target,n,list,whole);
    }


}

