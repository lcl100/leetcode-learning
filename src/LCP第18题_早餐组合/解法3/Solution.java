package LCP第18题_早餐组合.解法3;

import java.util.Arrays;

public class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        // 二分查找必须有序数组，所以先排序
        Arrays.sort(staple);
        Arrays.sort(drinks);
        // 统计次数
        int count = 0;// 计数器，统计次数
        int mod = (int) Math.pow(10, 9) + 7;// 变量，答案需要以 1e9 + 7 (1000000007) 为底取模，因为可能数过大，无法表示所以需要取模
        for (int i = 0; i < staple.length; i++) {
            int target = x - staple[i];// 目标数，即能够使staple[i] + drinks[j]<=x的数
            int index = binSearch(drinks, target);// 二分查找目标数的索引，如果查找到，那么表示之前的所有数都小于等于target
            count = (count + index) % mod;// 计算count，由于count可能过大，需要取模
        }
        return count % mod;
    }

    // 二分查找
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
        0.排序+二分查找
        1.先对两个数组进行排序，接着遍历staple数组或drinks数组，使用二分查找另一个数（加起来和小于x的数），而那个数的前面所有数与staple[i]或drinks[i]的和都小于x
        2.大致上原理和解法2一样，只是本题中是使用二分法查找合适的数，解法2是使用双指针查找
 */
/*
    执行用时：150 ms, 在所有 Java 提交中击败了7.26% 的用户
    内存消耗：58.1 MB, 在所有 Java 提交中击败了51.88% 的用户
 */