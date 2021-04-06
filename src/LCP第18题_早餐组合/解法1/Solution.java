package LCP第18题_早餐组合.解法1;

class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int count = 0;
        for (int i = 0; i < staple.length; i++) {
            for (int j = 0; j < drinks.length; j++) {
                if (staple[i] + drinks[j] <= x) {
                    count++;
                }
            }
        }
        return count % ((int) Math.pow(10, 9) + 7);
    }
}
/*
    解题思路：
        0.双层for循环，暴力破解
 */
/*
    超出时间限制（57 / 65 个通过测试用例）
 */