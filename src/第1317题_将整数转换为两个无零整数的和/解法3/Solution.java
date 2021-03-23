package 第1317题_将整数转换为两个无零整数的和.解法3;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = n / 2;// 除此之外，还可以获取随机数来得到数
        while (!isContainZero(i) || !isContainZero(n - i)) {
            i /= 2;
        }
        return new int[]{i, n - i};
    }

    // 判断数num中是否包含0
    private boolean isContainZero(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
/*
    解题思路：
        0.算是解法2的优化，判断一个数中是否包含0，用的是解法2中的方法，不要转换成字符串，效率低
        1.不过是不断取半值
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了86.61% 的用户
 */