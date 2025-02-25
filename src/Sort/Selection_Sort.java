package src.Sort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,76,5,4,3,2,1};
         SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  SelectionSort(int arr[])
    {

        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;

            for (int j=i+1;j< arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }

            }
            swap(arr,min,i);
        }
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
