package 剑指Offer第53题II_0到n减1中缺失的数字.解法8;

public class Solution {
    public int missingNumber(int[] nums) {
        // 1.特殊情况的处理
        // 如果nums[0]不为0，那么必然缺失0，直接返回0
        if (nums[0] != 0) {
            return 0;
        }
        // 表示nums[0]==0并且长度为1，即nums[0]这样的情况，直接返回1即可
        if (nums.length == 1) {
            return 1;
        }
        // 2.双指针
        int i = 0, j = nums.length - 1;
        while (i < j) {
            // 处理数组长度为偶数的情况，每一对元素对都可以得到比较
            if (nums[i] + nums[j] > nums.length) {
                return i;
            } else if (nums[i] + nums[j] < nums.length) {
                return j + 1;
            } else {
                i++;
                j--;
            }
        }
        // 处理数组长度为奇数，最后剩下一个元素的情况
        return nums[i] == i ? i + 1 : nums[i] - 1;// 关键代码
    }
}
// [0,1,3]
// [0,1,2,3]

// [0,2,3]
// [0,1,2,3]
/*
    解题思路：
        0.双指针
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了15.34% 的用户
 */