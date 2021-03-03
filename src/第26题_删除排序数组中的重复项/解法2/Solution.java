package 第26题_删除排序数组中的重复项.解法2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // 1.创建Map集合
        Map<Integer, Integer> map = new LinkedHashMap<>();
        // 2.将nums数组中的元素以键值对的形式保存到map中，值为该数出现的次数
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 3.通过迭代器将map中的元素重新保存到数组中
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            nums[i] = iterator.next();
            i++;
        }
        // 4.返回新数组的长度
        return integers.size();
    }
}
/**
 * 思路：
 * 使用HashMap保存元素，键是元素名，值是出现次数
 */
