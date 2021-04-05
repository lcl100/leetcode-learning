package LCP第17题_速算机器人.解法2;

public class Solution {
    public int calculate(String s) {
        return 1 << s.length();
    }
}
/*
    解题思路：
        1.出现一个“A”，x+y=(2x+y)+y=2x+2y；出现一个"B"，x+y=x+(2y+x)=2x+2y
        2.所以出现一个A或B，都会使x+y的值翻倍
        3.所以最后返回的值为原(x+y)的s.length倍
    注：
        1.思路来源于题解：https://leetcode-cn.com/problems/nGK0Fy/solution/bu-xu-yao-bian-li-you-shu-xue-fang-fa-by-qcdxctcc/
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了78.00% 的用户
 */