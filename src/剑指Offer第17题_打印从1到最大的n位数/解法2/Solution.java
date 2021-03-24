package 剑指Offer第17题_打印从1到最大的n位数.解法2;

public class Solution {
    public int[] printNumbers(int n) {
        // size是限定范围的，Math.pow(10,n)表示得到10的n次方
        int size = (int) Math.pow(10, n) - 1;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
/*
    解题思路：
        0.通过Math.pow(m,n)来得到要返回数的范围，该pow(m,n)方法返回m的n次方
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：46.8 MB, 在所有 Java 提交中击败了39.14% 的用户
 */