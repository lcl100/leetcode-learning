package 第1486题_数组异或操作.解法1;

class Solution {
    public int xorOperation(int n, int start) {
        // 1.根据题意创建nums数组
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        // 2.将nums数组中所有元素进行异或操作
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
/*
    解题思路：
        1.根据题意创建nums数组
        2.将nums数组中所有元素进行异或操作
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了85.02% 的用户
 */