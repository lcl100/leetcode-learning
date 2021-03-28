package 第1662题_检查两个字符串数组是否相等.解法3;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = transformArray(word1);
        String s2 = transformArray(word2);
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }

    // 将字符串数组转换成一个字符串
    private String transformArray(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.解法2的优化
        1.不使用String的API比较两个字符串是否相等，而是自己比较字符
    总结：
        1.效率更高
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了69.37% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了24.83% 的用户
 */