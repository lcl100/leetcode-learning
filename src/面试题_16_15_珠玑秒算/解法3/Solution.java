package 面试题_16_15_珠玑秒算.解法3;

public class Solution {
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
        int[] solutionMap = getMap(solution);
        int[] guessMap = getMap(guess);
        for (int i = 0; i < solutionMap.length; i++) {
            falseGuess += Math.min(solutionMap[i], guessMap[i]);
        }
        return new int[]{guessRight, falseGuess - guessRight};
    }

    private int[] getMap(String str) {
        int[] map = new int[26];
        char[] chars = str.toCharArray();
        for (char c : chars) {
            map[c - 'A']++;
        }
        return map;
    }
}
/*
    解题思路：
        0.数组计数
        1.解法2的优化，用一个长度为26的数组来统计每个字符的出现次数，效率比HashMap更高
        2.其他代码基本上和解法2一样，但效率更高
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了98.29% 的用户
 */