package 第268题_丢失的数字.解法4;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int missingNumber(int[] nums) {
        // [0,1,2,3]求和
        int sum=nums.length*(nums.length+1)/2;

        // [3,0,1]求和
        int actualSum=0;
        for (int num : nums) {
            actualSum+=num;
        }

        // 求差
        return sum-actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0};
        System.out.println();
        System.out.println(solution.missingNumber(nums));
    }
}
/**
 * 思路：
 * 利用和的差
 */
