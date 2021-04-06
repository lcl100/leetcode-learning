package 第26题_删除有序数组中的重复项.解法1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // 将nums数组中元素添加到Set集合
        Set<Integer> set = new LinkedHashSet<>();// 需使用LinkedHashSet保证输入顺序
        for (int num : nums) {
            set.add(num);
        }
        // 替换nums数组中前set.length长度个数，用set中的数有序替换
        int i = 0;
        for (Integer num : set) {
            nums[i] = num;
            i++;
        }
        return set.size();
    }
}
/*
    解题思路：
        0.Set去重
        1.利用Set集合的唯一特性，将nums数组中所有元素添加到Set集合中
        2.由于要原地修改nums数组，系统会检查nums数组，所有要将nums数组中前set.length个元素用set中的元素有序替换
    特别注意：
        1.本解法不符合题目要求，原地修改数组，所以仅供参考
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了6.75% 的用户
    内存消耗：39.7 MB, 在所有 Java 提交中击败了99.58% 的用户
 */