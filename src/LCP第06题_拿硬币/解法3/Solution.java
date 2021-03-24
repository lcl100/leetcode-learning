package LCP第06题_拿硬币.解法3;

public class Solution {
    public int minCount(int[] coins) {
        int i = 0, j = coins.length - 1;
        int count = 0;
        while (i < j) {
            count += coins[i] % 2 == 0 ? coins[i] / 2 : coins[i] / 2 + 1;
            count += coins[j] % 2 == 0 ? coins[j] / 2 : coins[j] / 2 + 1;
            i++;
            j--;
        }
        // 处理中间的元素
        if (i == j) {
            count += coins[i] % 2 == 0 ? coins[i] / 2 : coins[i] / 2 + 1;
        }
        return count;
    }
}
/*
    解题思路：
        0.双指针
        1.从数组第一个位置和最后一个位置向中间遍历
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.5 MB, 在所有 Java 提交中击败了90.41% 的用户
 */