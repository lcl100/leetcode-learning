package 第1323题_6和9组成的最大数字.解法4;

public class Solution {
    public int maximum69Number(int num) {
        return Integer.parseInt((num + "").replaceFirst("6", "9"));
    }
}
/*
    解题思路：
        0.一行代码，API
        1.直接转换成字符串，然后替换第一个'6'字符，然后再转换成数字返回
 */
/*
    执行用时：12 ms, 在所有 Java 提交中击败了9.25% 的用户
    内存消耗：35.8 MB, 在所有 Java 提交中击败了8.54% 的用户
 */