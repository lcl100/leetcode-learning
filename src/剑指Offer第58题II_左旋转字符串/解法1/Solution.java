package 剑指Offer第58题II_左旋转字符串.解法1;

class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
/*
    解题思路：
        0.String的API
        1.直接利用substring()方法获取指定索引到指定索引之间的字符串，然后进行拼接
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：37.8 MB, 在所有 Java 提交中击败了99.05% 的用户
 */