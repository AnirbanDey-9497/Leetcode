package src.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr={8, 89,76,5,4,36,10,9,8,7,6,76,5,4,3,2,1};
        int low=0;
        int high= arr.length-1;
        QuickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  QuickSort(int arr[], int low, int high)
    {

        int partitionIndex=0;
        if(low<high)
        {
            partitionIndex=  partion(arr,  low, high);
            QuickSort(arr, low, partitionIndex-1);
            QuickSort(arr,partitionIndex+1,high);
        }
    }


    public static int partion(int arr[],int low,  int high)
    {
       int i=low;
       int j=high;
       int pivot=arr[low];

       while (i<j)
       {
           while(arr[i]<=pivot && i<=high)
           {
               i++;
           }
           while (arr[j]>pivot && j>=low)
           {
               j--;
           }
           if(i<j)
           {
               swap(arr, i,j);
           }

       }
        swap(arr, low, j);

       return j;
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
