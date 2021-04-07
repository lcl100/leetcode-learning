package 剑指Offer第57题_和为s的两个数字.解法3;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 双指针i和j分别指向数组nums的两端
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum == target) {
                return new int[]{nums[i], nums[j]};
            } else if (sum < target) {
                i++;
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.双指针
        1.初始化双指针i和j，i指向数组的首端，j指向数组的尾端
        2.循环判断
            2.1求和sum = nums[i] + nums[j]
            2.2如果sum>target，那么j--
            2.3如果sum==target，那么return
            2.4如果sum<target，那么i++
    注：
        1.解题思路来源于题解：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/solution/mian-shi-ti-57-he-wei-s-de-liang-ge-shu-zi-shuang-/
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了94.96% 的用户
    内存消耗：55.3 MB, 在所有 Java 提交中击败了71.84% 的用户
 */