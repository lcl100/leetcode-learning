package 第594题_最长和谐子序列.解法3;


public class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else if (nums[j] + 1 == nums[i]) {
                    count++;
                    flag = true;
                }
            }
            if (flag) {
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
/*
    解题思路：
        0.暴力破解
 */
/*
    执行用时：2144 ms, 在所有 Java 提交中击败了5.04% 的用户
    内存消耗：39.5 MB, 在所有 Java 提交中击败了55.44% 的用户
 */