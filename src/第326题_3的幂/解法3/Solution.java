package 第326题_3的幂.解法3;

public class Solution {
    public boolean isPowerOfThree(int n) {
        // 处理0和负数
        if (n <= 0) {
            return false;
        }
        // Integer.toString(n,3)将数转换成以3为基准的数
        // matches("^10*$")是正则表达式匹配，表示匹配以"1"开始并且"0"出现零次或任意次
        return Integer.toString(n, 3).matches("^10*$");
    }
}
/*
    解题思路：
        0.代码和思路来源于官方题解的方法二：https://leetcode-cn.com/problems/power-of-three/solution/3de-mi-by-leetcode/
        1.官方还有一些其他奇妙的解法，可以去官方题解查阅
 */
/*
    执行用时：42 ms, 在所有 Java 提交中击败了5.42% 的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了5.08% 的用户
 */