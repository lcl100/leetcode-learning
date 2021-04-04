package 剑指Offer第53题I_在排序数组中查找数字.解法4;

public class Solution {
    public int search(int[] nums, int target) {
        return binSearch(nums, target) - binSearch(nums, target - 1);
    }

    private int binSearch(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
/*
    解题思路：
        0.二分查找
        1.一般排序数组查找都可以考虑使用二分查找
    注：
        1.代码来自于https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/solution/mian-shi-ti-53-i-zai-pai-xu-shu-zu-zhong-cha-zha-5/
        2.可采用debug模式走一遍：[4, 5, 5, 7, 7, 8, 8, 10]和2
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：41.4 MB, 在所有 Java 提交中击败了50.44% 的用户
 */