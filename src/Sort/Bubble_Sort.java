package src.Sort;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,76,5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  BubbleSort(int arr[])
    {

        for(int i= arr.length-1;i>0;i--)
        {

            int disSwap=0;
            for (int j=0;j< i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);

                    disSwap=1;
                }

            }
            if(disSwap==0)
            {
                break;
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

