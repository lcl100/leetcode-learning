package 第81题_搜索旋转排序数组II.解法1;

class Solution {
    public boolean search(int[] nums, int target) {
        for (int num : nums) {
            // 直接循环遍历数组比较目标数
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
/*
    解题思路：
        0.暴力破解，循环
        1.直接判断nums数组中是否存在目标数target，不管它旋转还是没旋转的
    特别注意：
        1.本解法违背了题目要考查的初衷
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了28.49% 的用户
 */