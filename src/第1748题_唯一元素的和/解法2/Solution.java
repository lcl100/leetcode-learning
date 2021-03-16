package 第1748题_唯一元素的和.解法2;

import java.util.Arrays;

class Solution {
    public int sumOfUnique(int[] nums) {
        // 必须排序，因为排序后，重复元素才是连续相邻的
        Arrays.sort(nums);
        // i和j是指针，count记录元素的出现次数，sum是求和
        int i=0,j=1,count=1,sum=0;
        while (j<nums.length){
            if(nums[j]==nums[i]){
                count++;
            }else {
                if(count==1){
                    sum+=nums[i];
                }
                i=j;
                count=1;
            }
            // 无论是否是重复元素，j都向前移动
            j++;
        }
        // 处理特殊的边界，如：[1,2,2,4]
        if(j==nums.length&&(j-1)==i){
            sum+=nums[i];
        }
        return sum;
    }
}
/*
    解题思路：
        1.使用双指针来统计每个数的出现次数，并求和
 */
