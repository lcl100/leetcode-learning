package 第66题_加一.解法2;

public class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;// 计数器，统计数组中9的位数
        // 1.处理所有数都为9的情况
        for (int digit : digits) {// 该循环是统计数组中9的位数
            if (digit == 9) {
                count++;
            }
        }
        if (count == digits.length) {// 如果9的位数等于数组长度，那么表示数组的所有数都是9，意味着数组要添加一位
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        } else {
            // 2.处理可能存在9但最后一位不为9的情况
            if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1]++;
            } else {
                // 3.处理最后一位为9并且可能存在连续的9的情况
                int nineCount = 0;// 计数器，统计倒序数组中连续9的位数，便于计算下标
                for (int i = digits.length - 1; i >= 0; i--) {
                    if (digits[i] == 9) {
                        nineCount++;
                    } else {
                        break;// 当遇到第一个连续不是9时，直接跳出循环
                    }
                }
                digits[digits.length - nineCount - 1]++;// 数位加1
                for (int i = digits.length - 1; i > digits.length - nineCount - 1; i--) {// 将连续9都置为0
                    digits[i] = 0;
                }
                return digits;
            }
        }
        return digits;
    }
}
/**
 * 思路：暴力破解
 * 加一考虑的数分为三种：
 * 第一种：所有的数都为9，如9、99、99等。解决方法是将所有数置为0，然后数组添加一位，并且首位为1
 * 第二种：可能存在9但最后一位不为9，如912、892等。解决方法就是最后一位加1即可
 * 第三种：最后一位为9并且可能存在连续的9，如89、199、1699、8999等。解决方法就是将倒序的连续的9置为0，然后将连续9的前一位加1，如1699就是先置为1600，然后6加1为7即得1700
 */