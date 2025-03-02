package src.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequence_Sum_Count {
    public static void main(String[] args) {
        int [] arr= new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5 } ;
        List<Integer> list=new ArrayList<>();
        System.out.println("What is the sum for which you need the count");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        int index=0;
        int n=arr.length-1;
        int v= SubsequenceF(index,list,arr,x,n,sum);
        System.out.println("The count for the current sum is:"+ v);
    }
    public static int SubsequenceF(int index,List<Integer> list, int arr[], int x, int n,  int sum)
    {
        if(index>n)
        {
            if(sum==x)
            {
                System.out.println(list);
                return 1;
            }
            return 0;
        }

        list.add(arr[index]);
        sum=sum+arr[index];
        int left= SubsequenceF(index+1,list,arr,x,n,sum);
        list.remove(list.size()-1);
        sum=sum-arr[index];
        int right = SubsequenceF(index+1,list,arr,x,n, sum);
        return left+right;
    }
}
