package 第1796题_字符串中第二大的数字.解法2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int secondHighest(String s) {
        // 1.将字符串s中的数字放进Set集合
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                set.add(Integer.parseInt(c + ""));
            }
            i++;
        }
        // 2.处理特殊情况
        if (set.size() == 1 || set.size() == 0) {
            return -1;
        }
        // 3.查找第二大值
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
/*
    解题思路：
        0.解法1的变种，区别只是查找第二大值的方法不一样
        1.将字符串中的数字添加到Set集合中
        2.将Set集合转换成数组，然后对数组进行排序，最后返回数组倒数第二个元素就是第二大值
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了6.26% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了8.23% 的用户
 */