package 第167题_两数之和II之输入有序数组.解法2;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            // 先确定第一个数，第二个数通过二分查找来进行搜索
            // 这里第一个数，每次是numbers[i]
            int low = i + 1, high = numbers.length - 1;// 所以low要从i的下一个数开始起
            while (low <= high) {
                int middle = (low + high) / 2;
                if (target - numbers[middle] == numbers[i]) {
                    return new int[]{i + 1, middle + 1};
                } else if (target - numbers[middle] < numbers[i]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.二分法
        1.先确定第一个数，再通过二分查找确定第二个数
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了13.93% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了71.98% 的用户
 */