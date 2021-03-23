package 第1323题_6和9组成的最大数字.解法3;

public class Solution {
    public int maximum69Number(int num) {
        // 1.计算n，比如num是9996，那么n应该是1000，如果num是696那么n是100
        int tempNum = num;// 由于num会变化，所以需要一个临时变量
        int n = 1;
        while (tempNum / 10 != 0) {
            n *= 10;
            tempNum /= 10;
        }
        // 2.直接处理数
        tempNum = num;
        while (tempNum != 0) {
            if (tempNum / n != 9) {
                return num + 3 * n;
            }
            tempNum %= n;
            n /= 10;
        }
        return num;
    }
}
/*
    解题思路：
        0.直接判断，不要转换成字符串，否则效率直线下降
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了87.55% 的用户
 */