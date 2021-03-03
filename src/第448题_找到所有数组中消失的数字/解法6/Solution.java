package 第448题_找到所有数组中消失的数字.解法6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. 循环遍历nums数组中的元素，对每个元素进行负数处理
        for (int num : nums) {
            // 1.1 找到当前num所对应的索引
            int i = Math.abs(num) - 1;// 可能num已经是负数了，所以需要取绝对值，而负数仅表示标记作用
            // 1.2 将对应索引位置的正数乘以-1，如果是负数表示已经处理，不再处理
            if (nums[i] > 0) { // 只有是正数才进行标记，如果已经是负数了，那么表示是重复元素，不需要进行转为正数
                nums[i] *= -1;
            }
        }

        // 2. 将消失的数字添加到List集合中
        // 2.1 创建List集合
        List<Integer> list = new ArrayList<>();
        // 2.2 循环判断nums数组中那些数字是消失的数字，然后添加到List集合中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);// 消失的数字，即是对应索引加1
            }
        }

        // 3. 返回集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        参考自https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/solution/yi-zhang-dong-tu-bang-zhu-li-jie-yuan-di-uign/
 */
