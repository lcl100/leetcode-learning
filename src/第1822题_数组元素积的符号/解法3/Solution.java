package 第1822题_数组元素积的符号.解法3;

class Solution {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            result *= (num > 0) ? 1 : -1;
        }
        return result;
    }
}
/*
    解题思路：
        0.设定一个变量result，用来存储每个数的乘积
        1.循环遍历nums数组每个元素，如果元素是0则直接返回0
        2.如果是负数则result乘以-1，是正数则result乘以1
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了28.37% 的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了68.13% 的用户
 */