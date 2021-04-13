package 面试题_16_20_T9键盘.解法2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 建立字母对应数字的映射，这里用数组完成
    int[] map = new int[]{2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
    // char[] map=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public List<String> getValidT9Words(String num, String[] words) {
        // 1.将num数字字符串转换成数字数组
        int[] nums = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            nums[i] = num.charAt(i) - '1' + 1;
        }
        // 2.判断字符串
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (isValid(nums, word)) {
                list.add(word);
            }
        }
        return list;
    }

    // 根据映射数组map判断单词word是否合法
    private boolean isValid(int[] nums, String word) {
        for (int i = 0; i < nums.length; i++) {
            if (map[word.charAt(i) - 'a'] != nums[i]) {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.字典表
        1.同解法1不同的是，本解法使用的是数组来建立字典表，创建一个长度为26的数组，从0到25对应小写字母'a'到'z'
        2.将num数字字符串转换成数字数组nums，便于比较判断
        3.循环遍历words字符串数组，判断字符串word中的每个字符在字典表map中对应的数字与nums对应索引的数字是否相等，如果全部相等则表示可以
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：40 MB, 在所有 Java 提交中击败了84.92% 的用户
 */