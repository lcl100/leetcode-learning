package 第414题_第三大的数.解法3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        // 将nums中所有元素添加到Set集合中，去除重复元素
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        // 将set集合转换成数组
        Integer[] array = set.toArray(new Integer[set.size()]);
        // 特殊情况判断
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        // 初始化最大值、次大值、第三大值
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        // 遍历nums数组
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                thirdMax = num;
            }
        }
        return thirdMax;
    }
}

/*
    解题思路：
        0.单层for循环
        1.Set去重
        2.处理长度小于3的情况
        3.单层for循环遍历nums数组，判断最大值、次大值和第三大值
        4.最后返回第三大值即可
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了27.81% 的用户
    内存消耗：37.7 MB, 在所有 Java 提交中击败了99.66% 的用户
 */