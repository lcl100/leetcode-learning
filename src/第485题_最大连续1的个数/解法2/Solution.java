package 第485题_最大连续1的个数.解法2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 1.创建List集合存储0元素的索引
        List<Integer> list = new ArrayList<>();
        list.add(-1);// 添加左边界
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list.add(i);// 添加0元素的索引
            }
        }
        list.add(nums.length);// 添加右边界

        // 2.找出最大连续1个数
        int max = 0;// 记录两个索引之间的最大差距值
        for (int i = 0; i < list.size() - 1; i++) {
            int abs = Math.abs(list.get(i + 1) - list.get(i) - 1);// 获取两个索引之间差的绝对值
            if (abs > max) {
                max = abs;// 保存最大的哪个
            }
        }
        return max;
    }
}
/**
 * 思路：
 * 计算0的索引，注意可能第一个数不为0和最后一个数不为0的情况
 * 写出来的算法比解法1还要复杂，但其实逻辑还是比较清除，主要比较麻烦的就是边界值的判断
 * 即在索引数组中添加一个第一个值为-1，表示左边界，是为了处理第一个数为1的情况
 * 即在索引数组中添加一个最后一个值为数组长度，表示右边界，是为了处理最后一个数为1的情况
 * 然后索引数组中相邻索引的绝对值减1就是连续1的个数，而我们需要的是最大的那个。
 */