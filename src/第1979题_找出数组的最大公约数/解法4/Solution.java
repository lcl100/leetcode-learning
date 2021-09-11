package 第1979题_找出数组的最大公约数.解法4;

/**
 * @author lcl100
 * @create 2021-09-11 20:37
 */
public class Solution {
    /**
     * <p>思路：把辗转相除法和更相减损术的优势结合起来，在更相减损术的基础上使用移位运算。思想如下：
     * <ul>
     *     <li>当a和b均为偶数时，gcd(a,b) = 2×gcd(a/2, b/2) = 2×gcd(a>>1,b>>1)。</li>
     *     <li>当a为偶数，b为奇数时，gcd(a,b) = gcd(a/2,b) = gcd(a>>1,b)。</li>
     *     <li>当a为奇数，b为偶数时，gcd(a,b) = gcd(a,b/2) = gcd(a,b>>1)。</li>
     *     <li>当a和b均为奇数时，先利用更相减损术运算一次，gcd(a,b)=gcd(b,a-b)，此时a-b必然是偶数，然后又可以继续进行移位运算。</li>
     * </ul>
     * </p>
     * <p>例如，计算10和25的最大公约数的步骤如下：</p>
     * <ul>
     *     <li>1. 整数10通过移位，可以转换成求5和25的最大公约数。</li>
     *     <li>2.利用更相减损术，计算出25-5=20，转换成求5和20的最大公约数。</li>
     *     <li>3. 整数20通过移位，可以转换成求5和10的最大公约数。</li>
     *     <li>4. 整数10通过移位，可以转换成求5和5的最大公约数。</li>
     *     <li>5. 利用更相减损术，因为两数相等，所以最大公约数是5。</li>
     * </ul>
     *
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了67.14% 的用户</li>
     *     <li>内存消耗：38 MB, 在所有 Java 提交中击败了86.11% 的用户</li>
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

        // 第二步
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
        /*如果a和b都是偶数
            if(a%2==0&&b%2==0){
                return gcd(a/2, b/2)*2;
            }
         */
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        }
        /*如果a是偶数，b是奇数
            else if(a%2==0&&b%2!=0){
                return gcd(a/2, b);
            }
         */
        else if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        }
        /*如果a是奇数，b是偶数
            else if(a%2!=0&&b%2==0){
                return gcd(a, b/2);
            }
         */
        else if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        }
        /*如果a和b都是奇数
            else(a%2!=0&&a%2!=0){
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                return gcd(max - min, min);
            }
         */
        else {
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            return gcd(max - min, min);
        }
    }
}