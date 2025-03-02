package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int [] arr= new int[]{34, 67, 89} ;
        List<Integer> list=new ArrayList<>();
        int index=0;
        int n= arr.length-1;
        SubsequenceF(index,list,arr,n);
    }
    public static void SubsequenceF(int index, List<Integer> list, int arr[], int n)
    {
        if(index>n)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        SubsequenceF(index+1,list,arr,n);
        list.remove(list.size()-1);
        SubsequenceF(index+1,list,arr,n);
    }
}
