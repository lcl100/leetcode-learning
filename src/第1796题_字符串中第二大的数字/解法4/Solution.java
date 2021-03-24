package 第1796题_字符串中第二大的数字.解法4;

public class Solution {
    public int secondHighest(String s) {
        // 1.将字符串中的数字放到nums数组中
        int[] nums = new int[10];
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                // 注：48是'0'字符的ASCII码值
                nums[c - 48]++;// 次数加1
            }
            i++;
        }
        // 2.找出nums数组中第二大值
        boolean isMax = false;
        for (int j = nums.length - 1; j >= 0; j--) {
            // 跳过最大值
            if (!isMax && nums[j] != 0) {
                isMax = true;
                continue;
            }
            // 找到第二大值
            if (isMax && nums[j] != 0) {
                return j;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.一个萝卜一个坑
        1.每个数都可以放在数组nums中对应索引位置
        2.然后倒序遍历nums数组，找出倒数第二个不为0的数，返回它的索引
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了85.52% 的用户
 */