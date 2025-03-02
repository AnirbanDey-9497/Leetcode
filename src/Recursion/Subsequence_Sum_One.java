package src.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequence_Sum_One {

    public static void main(String[] args) {
        int [] arr= new int[]{30, 40, 50, 10, 20, 5, 4, 3, 2, 1, 5 } ;
        List<Integer> list=new ArrayList<>();
        System.out.println("What do you want the sum to be");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int index=0;
        int n= arr.length-1;
        int sum=0;
        SubsequenceF(index,list,arr,n,x,sum);
    }
    public static boolean SubsequenceF(int index, List<Integer> list, int arr[], int n,int x,int sum)
    {
        if(sum==x)
        {
            System.out.println(list);
            return true;
        }
        if(index>=n)
        {
            return false;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        if(SubsequenceF(index+1,list,arr,n,x,sum)==true)
        {
            return true;
        }
        list.remove(list.size()-1);
        sum=sum-arr[index];
        if(SubsequenceF(index+1,list,arr,n,x,sum)==true)
        {
            return true;
        }
        return false;
    }
}