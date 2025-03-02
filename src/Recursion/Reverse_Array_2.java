package src.Recursion;

import java.util.Arrays;

public class Reverse_Array_2 {
    public static void main(String[] args) {
        int arr[]= new int[]{78, 8, 9, 98, 80, 67, 69, 56, 43};
        int low=0;
        int high= arr.length-1;
        reverse(arr, low,high);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int arr[],int i,int n)
    {
        if(i>=n/2)return;
        swap(arr,i,n-i);
        reverse(arr, i+1, n-1);
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
