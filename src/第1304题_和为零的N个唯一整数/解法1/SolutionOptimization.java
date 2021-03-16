package 第1304题_和为零的N个唯一整数.解法1;

import java.util.Arrays;

/**
 * @author 二木成林
 * 解法1Solution的优化
 */
public class SolutionOptimization {
    public int[] sumZero(int n) {
        int[] sum = new int[n];
        for (int i = 0; i < n / 2; i++) {
            sum[i] = i + 1;
            sum[n - i - 1] = -(i + 1);
        }
        // 最后做一个判断即可
        if (n % 2 != 0) {
            sum[n / 2] = 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = new SolutionOptimization().sumZero(3);
        System.out.println(Arrays.toString(ints));
    }
}
/*
    解题思路：
        1.先判断数组长度是奇数还是偶数
        2.然后从首端和末端向中间添加元素，分别是一正一负，正好两个数的和为0
        3.如果n是偶数，刚才添加完成，如果n是奇数，则将最中间的数置为0
 */