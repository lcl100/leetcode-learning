package 第1502题_判断能否形成等差数列.解法1;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // 1.将数组排序
        Arrays.sort(arr);
        // 计算一个相邻两项的差
        int grade = arr[1] - arr[0];
        int i = 0;
        while (i < arr.length - 1) {
            // 比较是否相等，如果不相等表示不是等差数列
            if (arr[i] + grade != arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }
}
/*
    解题思路：
        1.将数组先排序
        2.计算一个相邻两项的差出来，然后用数组种的每个数加上这个差与后一个数比较是否相等，如果不相等则表示不满足等差数列，则返回false
 */