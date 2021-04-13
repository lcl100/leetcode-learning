package 面试题_16_15_珠玑秒算.解法1;

import java.util.ArrayList;
import java.util.List;

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
        List<String> list = new ArrayList<String>();
        for (char c : solution.toCharArray()) {
            list.add(String.valueOf(c));
        }
        for (char c : guess.toCharArray()) {
            if (list.contains(String.valueOf(c))) {
                falseGuess++;
                list.remove(String.valueOf(c));
            }
        }
        return new int[]{guessRight, falseGuess - guessRight};
    }
}
/*
    题目解析：
        1.题目有些难以理解，看下面的分析：
            例如：solution="RGBY",guess="GGRR"
                在solution字符串中的'G'字符和guess字符串中的'G'字符具有相同的索引，所以判定为“猜中1次”
                guess字符串中的'R'字符，在solution字符串中也存在，但它们的索引位置不同，所以判定为“伪猜中1次”
            总结：即两个字符串中相同索引位置的字符相同则表示猜中；如果两个字符串中都存在同一个字符但它们的索引位置不同则表示伪猜中
    解题思路：
        0.暴力破解
        1.先循环遍历两个字符串中的每个字符，判断相同索引位置的字符是否相等，如果相等则猜中次数加1
        2.由于在solution字符串和guess字符串中可能存在多个相同的字符，所以在判断完一个字符后，就需要删除该字符，以免重复判断
        3.即先将solution字符串中的每个字符装进List集合，然后遍历guess字符串中的每个字符，如果该字符在List集合中存在，那么伪猜中次数加1，并且删除List集合中的该元素
        4.注意，最后有效的伪猜中次数要减去猜中次数，因为要考虑重复的情况
            
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了39.19% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了27.62% 的用户
 */