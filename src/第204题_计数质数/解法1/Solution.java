package 第204题_计数质数.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countPrimes(int n) {
        // 对于1和0直接返回
        if (n <= 1) {
            return 0;
        }
        // list用来存放质数
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n - 1; i++) {
            if (isPrimeNumber(i)) {
                list.add(i);
            }
        }
        return list.size();
    }

    // 写一个算法判断该数是否是质数
    private boolean isPrimeNumber(int num) {
        // 这里用的方法是判断每个数能否被2~num-1的所有数整除
        for (int n = 2; n <= num - 1; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        1.质数就是在大于1的自然数中，除了1和它本身以外不能被其他数整除。例如：2，5，7等
        2.判断一个数是否是质数的方法一：判断一个整数m是否是素数，只需把 m 被 2 ~ m-1 之间（包括边界）的每一个整数去除，如果都不能被整除，那么 m 就是一个素数。
 */
/*
    超出时间限制（最后输入：499979）
 */