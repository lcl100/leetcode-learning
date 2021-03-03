package 第448题_找到所有数组中消失的数字.解法3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. 创建一个HashSet集合，并将nums数组中所有不重复元素保存到Set集合中，也就是实现了去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 2. 调用Set集合的contains()方法判断集合中是否有[1,n]中的元素，如果没有则将该元素添加到List集合中，即是消失的数字
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {// false表示不包含，!false才能为true
                list.add(i);
            }
        }

        // 3. 返回集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{1, 1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        1.将nums数组中所有元素添加到Set集合中，去掉重复元素
        2.然后判断set集合中是否包含[1,n]中的元素，如果不包含，说明缺少该元素，添加到List集合
 */