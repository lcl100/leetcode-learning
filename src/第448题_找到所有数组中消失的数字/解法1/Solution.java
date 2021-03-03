package 第448题_找到所有数组中消失的数字.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. 创建一个List集合来存放所有数组中消失的数字
        List<Integer> list = new ArrayList<>();
        // 2. 循环遍历[1, n]中的所有数字，包括1和n
        for (int i = 1; i <= nums.length; i++) {
            // 2.1 设置一个标志位flag，表示该数字是否出现在nums数组中
            boolean flag = false;// 标志位，false表示没有出现过
            // 2.2 循环遍历nums数组
            for (int num : nums) {
                // 2.3 判断num是否等于i，即判断数字是否出现在nums数组中
                if (i == num) {
                    // 如果出现了，则将flag设置为true，并且使用break跳出当前循环，表示该数字不是消失的数字
                    flag = true;
                    break;
                }
            }
            // 2.4 判断flag的值，如果flag为false，表示该数字i在nums数组中没有出现过一次，就是消失的数字
            if (!flag) {
                // 那么将消失的数字添加到List集合中
                list.add(i);
            }
        }
        // 3. 返回存储了消失的数字的集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        1.循环遍历数组，比较数组中每个元素是否在[1,n]中出现，如果没有出现则表示是所需要的数，使用List保存
    解题结果：
        超时
 */