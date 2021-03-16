package 第1287题_有序数组中出现次数超过百分之25的元素.解法3;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int limit = arr.length / 4;
        int slow = 0, fast = 0;
        int count = 0;// 计数器，记录每个数的出现次数
        while (fast < arr.length) {
            if (arr[slow] != arr[fast]) {
                count = fast - slow;
                if (count > limit) {
                    return arr[slow];
                }
                // 统计新数的出现次数，需要重置slow和count
                slow = fast;
                count = 0;
            } else {
                fast++;
            }
        }
        if (fast == arr.length) {// 处理特殊边界情况：[1,2,3,3]
            return arr[slow];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findSpecialInteger(new int[]{1, 2, 3, 3}));
    }
}
/*
    解题思路（解法1的优化）：
        1.用双指针slow和fast，还有一个存放数出现次数的变量count
        2.慢指针slow指向第一次出现的索引，快指针fast指向第一次不等的索引，fast-slow就是该数出现的次数
            例如：[1,2,2,6,6,6,6,7,10]，第一次循环，slow应该指向索引为0的元素，fast指向第一个不等于1的数即索引为1的元素，那么count=fast-slow=1
        3.判断count是否大于arr.length/4然后返回arr[slow]即可
 */
