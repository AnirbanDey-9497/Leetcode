package src.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class All_Subset_Sums {
    public static void main(String[] args) {
        int[] arr = new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5};
        int sum=0;
        int index=0;
        int n=arr.length;
        List<Integer> adda= new ArrayList<>();
        SubsetSums(index,arr, sum, n, adda);
        adda.sort(Integer::compareTo);
        System.out.println(adda);
    }
    public static void SubsetSums(int index, int arr[], int sum, int n, List<Integer> adda)
    {
        if(index>=n)
        {
            adda.add(sum);
            return ;
        }


        SubsetSums(index+1, arr, sum+arr[index],n, adda);

        SubsetSums(index+1,arr, sum,n, adda);


    }
}
