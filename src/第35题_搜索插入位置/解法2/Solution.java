package 第35题_搜索插入位置.解法2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        int index=-1;
        int mid;
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            mid=(low+high)/2;
            if(target==nums[mid]){
                index=mid;
                break;
            }else if(target>nums[mid]){
                low=mid+1;
            }else if(target<=nums[mid]){
                index=mid;
                high=mid-1;
            }
        }
        return index;
    }
}
/**
 * 思路：二分法
 *
 */