package 第1281题_整数的各位积和之差.解法1;

class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int product = 1;// 保存，各位数的积
        int sum = 0;// 保存，各位数的和
        int i = 0;
        while (i < s.length()) {
            int num = Integer.parseInt(s.charAt(i) + "");
            product *= num;
            sum += num;
            i++;
        }
        return product - sum;
    }
}
/*
    解题思路：
        0.逐位计算
        1.转换成字符串，然后逐位计算积与和，最后计算差值
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了6.28% 的用户
    内存消耗：35.3 MB, 在所有 Java 提交中击败了39.83% 的用户
 */