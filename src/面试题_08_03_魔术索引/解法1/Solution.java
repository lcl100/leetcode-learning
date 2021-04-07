package 面试题_08_03_魔术索引.解法1;

class Solution {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
/*
    题目解析：
        1.所谓的魔术索引就是是否存在i==nums[i]
    解题思路：
        0.暴力破解，单层for循环
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了33.70% 的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了26.78% 的用户
 */