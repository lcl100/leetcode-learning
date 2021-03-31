package 第383题_赎金信.解法3;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        int index=-1;
        for (char c : ransomNote.toCharArray()) {
            index = sb.indexOf(String.valueOf(c));
            if (index >= 0) {
                // 删除指定index处的字符
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
/*
    解题思路：
        1.遍历ransomNote字符串中的所有字符，如果该字符在magazine字符串中存在，那么删除该字符，如果不存在则返回false
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了58.58% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了37.57% 的用户
 */