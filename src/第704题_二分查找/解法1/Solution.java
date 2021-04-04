package 第704题_二分查找.解法1;

class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.暴力循环
        1.即循环遍历nums数组中一一判断元素等于target的情况，如果存在则返回下标，如果不存在则返回false
        2.本题考查的是二分查找，所以本解法只是参考
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了5.61% 的用户
    内存消耗：39.7 MB, 在所有 Java 提交中击败了5.23% 的用户
 */