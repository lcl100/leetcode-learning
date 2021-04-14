package 剑指Offer第39题_数组中出现次数超过一半的数字.解法3;

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int number = nums[0];// 设定出现次数超过一半的数字
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                number = nums[i];
            } else if (nums[i] == number) {
                count++;
            } else {
                count--;
            }
        }
        return number;
    }
}
/*
    解题思路：
        0.摩尔投票法
        1.混战，一换一，最后剩下的一定是出现次数超过一半的数字
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了99.96% 的用户
    内存消耗：41.7 MB, 在所有 Java 提交中击败了54.30% 的用户
 */