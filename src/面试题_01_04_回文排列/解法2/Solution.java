package 面试题_01_04_回文排列.解法2;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canPermutePalindrome(String s) {
        // 1.将s转换成字符数组，并去重
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char aChar : chars) {
            set.add(aChar);
        }
        Character[] characters = set.toArray(new Character[set.size()]);
        // 2.统计每个数的出现次数，并统计出现次数是奇数的个数
        int oddNumberCount = 0;// 计数器，记录count是奇数的个数
        for (char aChar : characters) {
            int count = 0;// 计数器，记录每个数的出现次数
            for (char c : chars) {
                if (aChar == c) {
                    count++;
                }
            }
            // 判断出现次数是否是奇数
            if (count % 2 != 0) {
                oddNumberCount++;
            }
            // 如果奇数次大于1则不是回文串
            if (oddNumberCount > 1) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解
        1.将chars数组通过Set集合去重
        2.统计set集合中每个元素的出现次数，如果出现次数是奇数次的情况超过一次，那么就不是回文串
 */
