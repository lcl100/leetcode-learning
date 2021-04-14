package 第1822题_数组元素积的符号.解法1;

class Solution {
    public int arraySign(int[] nums) {
        double product = 1;// 注意，这里不能用int而要用double，否则乘积会超出范围导致得到错误答案
        for (int num : nums) {
            product *= num;// 循环计算乘积
        }
        // 调用signFunc()函数得到特定值
        return signFunc((int) product);
    }

    // 函数 signFunc(x) 将会根据 x 的正负返回特定值
    private int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
/*
    解题思路：
        0.暴力破解
        1.循环nums数组计算每个数的乘积，然后调用signFunc函数得到特定值
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了28.37% 的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了8.73% 的用户
 */