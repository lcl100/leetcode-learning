package 第1979题_找出数组的最大公约数.解法2;

/**
 * @author lcl100
 * @create 2021-09-11 20:23
 */
public class Solution {
    /**
     * <p>思路：辗转相除法。两个正整数a和b（a>b），它们的最大公约数等于a除以b的余数c和b之间的最大公约数。
     * 例如10和25，25除以10商2余5，那么10和25的最大公约数，等同于10和5的最大公约数。
     * 首先，计算出a除以b的余数c，把问题转化成求b和c的最大公约数；然后计算出b除以c的余数d，
     * 把问题转化成求c和d的最大公约数；再计算出c除以d的余数e，把问题转化成求d和e的最大公约数……以此类推，
     * 逐渐把两个较大整数之间的运算简化成两个较小整数之间的运算，直到两个数可以整除，或者其中一个数减小到1为止。</p>
     *
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：37.9 MB, 在所有 Java 提交中击败了97.13% 的用户</li>
     *     <li>通过测试用例：215 / 215</li>
     * </ul>
     *
     * @param nums 整数数组
     * @return 最大数和最小数的最大公约数
     */
    public int findGCD(int[] nums) {
        // 第一步，求得数组中的最大数和最小数
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 第二步，不断辗转相除
        return gcd(max, min);
    }

    /**
     * <p>求两个数的最大公约数，利用辗转相除法。</p>
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 最大公约数
     */
    private int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return min;
        }
        return gcd(max % min, min);
    }
}
