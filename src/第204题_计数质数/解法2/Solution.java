package 第204题_计数质数.解法2;

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
        // 循环判断2~n-1是否是质数
        for (int i = 2; i <= n - 1; i++) {
            if (isPrimeNumber(i)) {
                list.add(i);
            }
        }
        return list.size();
    }

    // 写一个算法判断该数是否是质数
    private boolean isPrimeNumber(int num) {
        // 这里用的方法是判断每个数能否被2~√num（表示根号num）的所有数整除
        for (int n = 2; n <= Math.sqrt(num); n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.解法1的优化
        1.如果判断数num是否是一个质数，那么其二分之一之后的数就可以不用计算了，肯定会余，也就是判断方法是用2~√num之间（包括边界）的所有整数去除，如果都无法整除，那么num就是质数
 */
/*
    超出时间限制（最后输入：1500000）
 */