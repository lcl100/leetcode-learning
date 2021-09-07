package 第693题_交替位二进制数.解法4;

/**
 * @author lcl100
 * @create 2021-09-06 22:56
 */
public class Solution {

    /**
     * <p>思路：取余运算，将整数n不断对2取余，获取它的二进制数，来比较相邻是否相等，而last记录上一个二进制位的值。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：35.1 MB, 在所有 Java 提交中击败了77.64% 的用户</li>
     *     <li>通过测试用例：204 / 204</li>
     * </ul>
     *
     * @param n 十进制数字
     * @return 如果它的二进制数表示总是0、1交替出现则返回true
     */
    public boolean hasAlternatingBits(int n) {
        // 记录上一个二进制位的值，初始值为-1，不能为0或1
        int last = -1;
        while (n > 0) {
            // 当前二进制位与上一个二进制位比较，如果相等表示相邻的两位二进制相同，则返回false
            if (last == n % 2) {
                return false;
            }
            // 将当前二进制位赋给last
            last = n % 2;
            // 继续下一次循环
            n /= 2;
        }
        return true;
    }
}
