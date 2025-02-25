package src.Sort;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,76,5,4,3,2,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  InsertionSort(int arr[])
    {

        for(int i= 0;i<arr.length;i++)
        {

            int j=i;
           while (j>0 && arr[j]>arr[j+1])
            {

                    swap(arr,j,j+1);

                    j--;


            }


        }
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
