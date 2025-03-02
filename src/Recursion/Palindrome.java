package src.Recursion;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int arr[]= new int[]{7, 8, 9, 98, 80, 98, 9, 8, 7};
        int low=0;
        int high= arr.length-1;
        boolean x= reverse(arr, low,high);

        if(x==true)
        {
            System.out.println("Palindrome");
        }

    }
    public static boolean reverse(int arr[],int i,int n)
    {
        if(i>=n/2)return true;
        if(arr[i]!=arr[n])
        {
            return false;
        }
       return reverse(arr, i+1, n-1);
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

