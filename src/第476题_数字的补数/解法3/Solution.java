package 第476题_数字的补数.解法3;

public class Solution {
    public int findComplement(int num) {
        int bits = 1;
        while (bits<num) {
            bits <<= 1;
            bits+=1;
        }
        return (bits ^ num);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(14));
    }
}
