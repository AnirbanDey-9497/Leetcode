package src.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class KADANES_ALGO {


    public void rotate(int[] nums, int k) {

        int n=nums.length%k;
        int left=0;
        int right= k-1;
        Arrays.setAll(nums,i-> {
            return nums[nums.length - 1 - i];
        });
        for (int i=0;i< k ;i++)
        {
            int temp=nums[left];
            nums[left++]= nums[right];
            nums[right++]=temp;
        }
        int l=k;
        int r= nums.length-1;
        for (int i=0;i< nums.length ;i++)
        {
            int temp=nums[l];
            nums[l++]= nums[r++];
            nums[r++]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }


}
