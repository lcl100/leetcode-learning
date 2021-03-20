package 剑指Offer第03题_数组中重复的数字.解法1;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 1.使用Set去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] integers = set.toArray(new Integer[set.size()]);
        // 2.双层for循环遍历
        for (Integer integer : integers) {
            int count = 0;// 计数器，记录每个数的出现次数
            for (int num : nums) {
                if (integer == num) {
                    count++;
                }
            }
            if (count > 1) {
                return integer;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.暴力破解，双层for循环
        1.将nums数组使用Set去重，然后双层for循环，计算每个数的出现次数
        2.找出出现次数大于1的数字
    注意事项：
        0.超时，不推荐
 */