package 第1979题_找出数组的最大公约数.解法3;

/**
 * @author lcl100
 * @create 2021-09-11 20:32
 */
public class Solution {
    /**
     * <p>思路：更相减损术：两个正整数a和b（a>b），它们的最大公约数等于a-b的差值c和较小数b的最大公约数。
     * 例如10和25，25减10的差是15，那么10和25的最大公约数，等同于10和15的最大公约数。由此，我们同样可以通过递归来简化问题。
     * 首先，计算出a和b的差值c（假设a>b），把问题转化成求b和c的最大公约数；然后计算出c和b的差值d（假设c>b），
     * 把问题转化成求b和d的最大公约数；再计算出b和d的差值e（假设b>d），把问题转化成求d和e的最大公约数……</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了67.14% 的用户</li>
     *     <li>内存消耗：37.6 MB, 在所有 Java 提交中击败了99.84% 的用户</li>
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

        // 第二步，不断更相减损术
        return gcd(max, min);
    }

    /**
     * <p>求两个数的最大公约数，利用更相减损术。</p>
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 最大公约数
     */
    private int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return gcd(max - min, min);
    }
}
