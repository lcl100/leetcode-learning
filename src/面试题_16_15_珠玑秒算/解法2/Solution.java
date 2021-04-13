package 面试题_16_15_珠玑秒算.解法2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] masterMind(String solution, String guess) {
        // 猜中的次数
        int guessRight = 0;
        for (int i = 0; i < solution.length(); i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                guessRight++;
            }
        }
        // 伪猜中的次数
        int falseGuess = 0;
        Map<Character, Integer> solutionMap = getMap(solution);
        Map<Character, Integer> guessMap = getMap(guess);
        for (Character key : solutionMap.keySet()) {
            falseGuess += Math.min(solutionMap.getOrDefault(key, 0), guessMap.getOrDefault(key, 0));
        }
        return new int[]{guessRight, falseGuess - guessRight};
    }

    // 统计指定字符串str中每个字符的出现次数用Map
    private Map<Character, Integer> getMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        return map;
    }
}
/*
    解题思路：
        0.HashMap计数
        1.单独处理猜中次数，即循环遍历判断相同索引位置的字符是否相等，如果相等则猜中次数加1
        2.接着调用getMap()方法获取solution字符串和guess字符串中每个字符的出现次数
        3.循环遍历两个Map，取相同字符出现次数的最小值，那就是伪猜中次数
        4.注意，最终的伪猜中次数要减去猜中次数，因为包含了重复的猜中次数，而题目要求去掉
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了39.19% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了32.98% 的用户
 */