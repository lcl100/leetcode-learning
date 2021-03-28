package 第1662题_检查两个字符串数组是否相等.解法2;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return transformArray(word1).equals(transformArray(word2));
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
        1.自定义方法将字符串数组转换成字符串然后比较是否相等
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了8.44% 的用户
    内存消耗：37.7 MB, 在所有 Java 提交中击败了5.02% 的用户
 */