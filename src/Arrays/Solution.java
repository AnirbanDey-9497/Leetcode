package src.Arrays;

import java.util.Arrays;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count=0;
            }
            count++;
            maxi=Integer.max(maxi,count);
        }
        return  maxi;
    }
}
