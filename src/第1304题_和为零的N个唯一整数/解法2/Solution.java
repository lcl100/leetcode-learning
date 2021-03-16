package 第1304题_和为零的N个唯一整数.解法2;

import java.util.Arrays;

public class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;// 记录总和，即从1到n-1的总和
        for (int i = 0; i < n - 1; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        // 将最后一个元素直接赋值为前面所有元素和的负数
        arr[n - 1] = -sum;
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().sumZero(2);
        System.out.println(Arrays.toString(ints));
    }
}
/*
    解题思路：
        1.先在数组中按顺序添加n-1个元素，元素值可以任意只要不重复即可
        2.然后数组的最后一个元素的位置，添加前面所有元素和的相反数（应该用相反数来说明，前面的n-1个数可能是负数，本例中添加的是正数而已）。
 */