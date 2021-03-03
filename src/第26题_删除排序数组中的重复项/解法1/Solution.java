package 第26题_删除排序数组中的重复项.解法1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // 1.实例化Set集合，注意，不能使用HashSet，因为输出要求有序，从小到大
        Set<Integer> set = new LinkedHashSet<>();
        // 2.添加数组元素到集合中去重
        for (int num : nums) {
            set.add(num);
        }
        // 3.将集合中去重的元素重新保存到nums数组中
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            nums[i] = iterator.next();
            i++;
        }
        // 4.返回新数组的大小，也可以return nums.length;
        return set.size();
    }
}
/**
 * 思路：
 * 利用Set集合去重，然后将Set集合中的无重复元素保存到nums数组中，并返回新数组的大小
 */