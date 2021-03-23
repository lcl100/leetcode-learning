package 第1437题_是否所有1都至少相隔k个元素.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        // 1.用List记录数为1的索引
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                indexList.add(i);
            }
        }
        // 2.比较索引的差值是否符合要求
        for (int i = 0; i < indexList.size() - 1; i++) {
            if (indexList.get(i + 1) - indexList.get(i) - 1 < k) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.记录出现索引
        1.ArrayList记录数为1的索引
        2.判断相邻索引的差值是否小于k，如果是则返回false，否则返回true
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了7.40% 的用户
    内存消耗：48.4 MB, 在所有 Java 提交中击败了32.93% 的用户
 */