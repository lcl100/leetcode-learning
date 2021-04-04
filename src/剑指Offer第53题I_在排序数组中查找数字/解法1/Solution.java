package 剑指Offer第53题I_在排序数组中查找数字.解法1;

class Solution {
    public int search(int[] nums, int target) {
        int count = 0;// 计数器，记录target在nums数组中的出现次数
        for (int num : nums) {
            if (num == target) {
                count++;// 统计出现次数
            }
        }
        return count;
    }
}
/*
    解题思路：
        0.暴力破解，单层for循环
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了28.19% 的用户
    内存消耗：41.6 MB, 在所有 Java 提交中击败了16.15% 的用户
 */