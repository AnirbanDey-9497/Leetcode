package src.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,76,5,4,3,2,1};
        int low=0;
        int high= arr.length-1;
        MergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    public static  void  MergeSort(int arr[], int low, int high)
    {

        if(low>=high)
        {
            return;
        }
        int mid= (low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr,mid+1, high);
        Merge(arr,low,mid,high);
    }

    public static void Merge(int arr[],int low, int mid, int high)
    {
        List<Integer> array= new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid &&  right<=high)
        {
            if(arr[left]<=arr[right])
            {
                array.add(arr[left]);
                left++;
            }
            else
            {
                array.add(arr[right]);
                right++;
            }
        }
        while (left<=mid)
        {
            array.add(arr[left]);
            left++;
        }
        while (right<=high)
        {
            array.add(arr[right]);
            right++;
        }

        for (int i=0;i<array.size();i++)
        {
            arr[low+i]= array.get(i);
        }

    }

}
