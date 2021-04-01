package 第747题_至少是其他数字两倍的最大数.解法3;

public class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;// 最大值的索引
        boolean flag = true;// 标记是否至少是其他数字的两倍
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                // 表示nums[i]比最大值还大
                flag = nums[i] >= 2 * nums[maxIndex];// 判断新最大值是否至少是原最大值的两倍
                maxIndex = i;// 那么保存新最大值的索引
            } else {
                // 表示nums[i]比最大值小
                if (nums[maxIndex] < nums[i] * 2) {
                    flag = false;
                }
            }
        }
        return flag ? maxIndex : -1;
    }
}
/*
    解题思路：
        1.一次遍历循环，设置一个最大值索引变量和flag标记变量
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了50.61% 的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了9.03% 的用户
 */