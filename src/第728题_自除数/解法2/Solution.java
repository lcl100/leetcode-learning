package 第728题_自除数.解法2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        // 循环遍历[left,right]中所有数字（包括边界）
        for (int i = left; i <= right; i++) {
            // 调用isDivisor()方法判断该数是否是自除数，如果是则添加到List
            if (isDivisor(i)) {
                list.add(i);
            }
        }
        return list;
    }

    // 判断一个数是否是自除数，例如：128
    private boolean isDivisor(int num) {
        // 临时保存num，因为后面num会变化，而num这个数又会被用到，所以需要保存
        int tempNum = num;
        // 局部变量，count用来记录数num中有几位能够被num除尽，而i用来记录num的位数
        // 例如：120中count统计为2表示有两位能够被120除尽，而i统计为3表示数120一共有三位数字
        int count = 0, i = 0;
        // 循环遍历num
        while (num > 0) {
            // 获取num的余数，例如：128%10=8
            int n = num % 10;
            // 判断获得的余数n能否被num除尽，例如：128%8==0，就可以除尽那么count++
            if (n != 0 && tempNum % n == 0) {
                count++;
            }
            // 计数器i加1
            i++;
            // 最后num要除以10，比较下一位，例如：128/10=12
            num /= 10;
        }
        // 必须num中所有位都能够被num除尽才表示该数是自除数
        return count == i;
    }
}
/*
    解题思路：
        1.循环读取数num的每一位来判断该数是否是自除数，而不是转换成字符串
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了42.37% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了81.44% 的用户
 */
