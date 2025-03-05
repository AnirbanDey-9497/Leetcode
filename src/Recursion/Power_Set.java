package src.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Power_Set {

    public static void main(String[] args) {
        int[] arr = new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5};
        Subset(arr);
    }
    public static void Subset(int arr[])
    {
        int n=arr.length;
        int subsets= 1<<n;
        List<List<Integer>> whole = new ArrayList<>();
        for(int i=0; i<subsets;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i & (1 << j)) != 0)
                {
                    list.add(arr[j]);
                }
            }
            whole.add(list);
        }
        System.out.println(whole);
    }
}
