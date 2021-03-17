package 第349题_两个数组的交集.解法2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 1.排序对nums1和nums2
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 2.设置两根指针i和j，并循环遍历
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        // 3.将集合转换成数组返回
        int[] result = new int[set.size()];
        Integer[] ts = set.toArray(new Integer[set.size()]);
        for (int i1 = 0; i1 < ts.length; i1++) {
            result[i1] = ts[i1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().intersection(new int[]{7, 2, 2, 4, 7, 0, 3, 4, 5}, new int[]{3, 9, 8, 6, 1, 9});
        System.out.println(Arrays.toString(ints));
    }
}
/*
    解题思路：
        0.双指针
        1.先对两个数组进行排序，分别用两根指针i和j指向nums1和nums2
        2.比较两根指针所指向数的大小
            2.1如果nums1[i]小于nums2[j]，那么i指针前进一步，继续比较
            2.2如果nums1[i]等于nums2[j]，那么添加到Set集合中保存，顺便完成了去重
            2.3如果nums1[i]大于nums2[j]，那么j指针前进一步
        3.最后将Set集合中的元素保存到数组返回即可
 */