package 面试题_01_04_回文排列.解法3;

import java.util.Arrays;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        // 将字符串s转换成字符数组
        char[] chars = s.toCharArray();
        // 对字符数组进行排序
        Arrays.sort(chars);
        // 变量声明
        int count = 0;// 计数器，统计每个数的出现次数
        int oddNumberCount = 0;// 计数器，记录出现次数是奇数的次数
        int i = 0;// 指针，记录每个数出现的起始索引
        int j = 0;// 指针，记录每个数出现的结束索引，如[1,2,2,3]那么如果记录数为2则i为1，j为3，其中j-i就是该数的出现次数
        // 循环遍历chars字符数组
        while (j < chars.length) {
            // 判断是否是重复数
            if (chars[j] == chars[i]) {
                // 如果相等，则计数器count加1，并且j指针前进一步
                count++;
                j++;
            } else {
                // 如果不相等，表示对该数的出现次数统计已经完成，接下来就是判断该数并且重置计数器和指针了
                // 如果该数的出现次数是奇数则oddNumberCount加1
                if (count % 2 != 0) {
                    oddNumberCount++;
                }
                // 重置计数器和指针，开始下一轮统计判断
                count = 0;// 计数器count重置为0
                i = j;// 起始索引置为当前j指针所指向的索引
            }
        }
        // 处理边界情况
        if (j == chars.length && (j - i) % 2 != 0) {
            oddNumberCount++;
        }
        // 判断是出现次数是奇数的次数是否大于1，如果大于1则不是回文串
        if (oddNumberCount > 1) {
            return false;
        }
        return true;
    }

}
/*
    解题思路：
        0.双指针计数
        1.先将字符串转换成字符数组并进行排序
        2.用两根指针来实现对每个字符出现次数的统计，并再用一个变量oddNumberCount对出现次数是奇数次的统计判断
        3.回文串中字符的出现次数是奇数次只能出现一次，也就是说oddNumberCount大于1就不满足回文串的条件了
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了86.05% 的用户
 */