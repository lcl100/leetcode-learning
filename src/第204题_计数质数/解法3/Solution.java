package 第204题_计数质数.解法3;

import java.util.Arrays;

public class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);// 将isPrime数组中所有值置为1
        int result = 0;// 变量，用来记录质数的个数
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 1) {// 如果为1，表示该数是质数
                result++;// 那么result加1即可
                if ((long) i * i < n) {
                    // 下面这段代码就是排除i的倍数的数不是质数
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return result;
    }
}
/*
    解题思路：
        0.数学
        1.该算法由希腊数学家厄拉多塞（Eratosthenes\rm EratosthenesEratosthenes）提出，称为厄拉多塞筛法，简称埃氏筛。
        2.是这样的：如果x是质数，那么大于x的x的倍数如2x、3x一定不是质数，关键从这里开始
        3.设置一个n大小的isPrime[]数组，用isPrime[i]表示数i是不是质数，如果是质数则isPrime[i]为1，否则为0。
        4.从小到大遍历每个数，如果这个数是质数，就将其的所有的倍数都置为0，这样在遍历结束时就知道质数个数了
            例如：如果选中的数是2，那么排除2的倍数不是质数，如4、6、8、10等
                如果选中的数是3，那么排除3的倍数不是质数，如9、15、21等
   思路来源：
        1.解题思路来源于官方题解：https://leetcode-cn.com/problems/count-primes/solution/ji-shu-zhi-shu-by-leetcode-solution/

 */
/*
    执行用时：24 ms, 在所有 Java 提交中击败了53.58% 的用户
    内存消耗：42.9 MB, 在所有 Java 提交中击败了13.99% 的用户
 */