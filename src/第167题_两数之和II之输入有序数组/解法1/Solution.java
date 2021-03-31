package 第167题_两数之和II之输入有序数组.解法1;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.暴力破解，双层for循环
 */
/*
    执行用时：219 ms, 在所有 Java 提交中击败了8.67% 的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了38.70% 的用户
 */