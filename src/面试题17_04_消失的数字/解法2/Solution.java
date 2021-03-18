package 面试题17_04_消失的数字.解法2;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        // 对数组进行排序
        // [3,0,1]  ——>     [0,1,3]
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;// 注意：特殊情况如[0]
    }
}
/*
    解题思路：
        0.排序
        1.将数组进行排序，那么数组中每个元素必定和它们所对应的索引相等
        2.遍历循环数组，如果第一次出现不相等的情况，那么索引必然是缺失的数字
 */
