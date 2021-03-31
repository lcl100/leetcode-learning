package 第167题_两数之和II之输入有序数组.解法3;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
}
/*
    解题思路：
        0.双指针
        1.初始时两个指针分别指向第一个元素位置和最后一个元素的位置。
        2.每次计算两个指针指向的两个元素之和，并和目标值比较。
        3.如果两个元素之和等于目标值，则发现了唯一解。
        4.如果两个元素之和小于目标值，则将左侧指针右移一位。
        5.如果两个元素之和大于目标值，则将右侧指针左移一位。
        6.移动指针之后，重复上述操作，直到找到答案。
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了93.07% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了91.27% 的用户
 */