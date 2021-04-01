package 第771题_宝石和石头.解法4;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        return stones.replaceAll("[^" + jewels + "]", "").length();
    }
}
/*
    解题思路：
        0.正则表达式
        1.正则表达式[^abc]的含义就是匹配除了abc字符以外的所有字符，然后用replaceAll()方法替换为空
        2.也就是说最后留下的就是只存在于jewels字符串中的字符，直接返回长度即可
            例如："[^aA]"匹配"aAAbbbb"，最后执行replaceAll()返回留下来的字符串是"aAA"
 */
/*
    执行用时：10 ms, 在所有 Java 提交中击败了5.63% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了5.04% 的用户
 */