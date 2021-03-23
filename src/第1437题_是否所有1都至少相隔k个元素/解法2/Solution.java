package 第1437题_是否所有1都至少相隔k个元素.解法2;

public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int preIndex = -1;// 设置为-1，是因为我们最开始不知道第一个为1的数的索引
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // 赋予初始索引的值并跳出本次循环，不执行下面的代码
                if (preIndex == -1) {
                    preIndex = i;
                    continue;
                }
                // 核心判断
                if (i - preIndex - 1 < k) {
                    return false;
                } else {
                    preIndex = i;
                }
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.记录出现次数
        1.直接循环判断，不使用第三方容器
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了25.06% 的用户
    内存消耗：48.7 MB, 在所有 Java 提交中击败了5.96% 的用户
 */
