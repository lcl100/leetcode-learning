package 第412题_FizzBuzz.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int iMod3=i%3;
            int iMod5=i%5;
            if (iMod3 != 0 && iMod5 != 0) {
                list.add(String.valueOf(i));
            } else if (iMod3 == 0 && iMod5 == 0) {
                list.add("FizzBuzz");
            } else if (iMod3 == 0) {
                list.add("Fizz");
            } else if (iMod5 == 0) {
                list.add("Buzz");
            }
        }
        return list;
    }
}
/*
    解题思路：
        0.暴力破解
        1.循环[1,n]这n个数，判断该数的4种情况：
            第一种：既不是3的倍数也不是5的倍数，则输出原数字
            第二种：是3的倍数，输出"Fizz"
            第三种：是5的倍数，输出"Buzz"
            第四种：既是3的倍数又是5的倍数，输出"FizzBuzz"
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了98.11% 的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了87.74% 的用户
 */