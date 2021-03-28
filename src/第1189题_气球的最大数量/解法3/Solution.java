package 第1189题_气球的最大数量.解法3;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] chars=new int[26];
        int i=0;
        int len=text.length();
        while (i<len){
            char c=text.charAt(i);
            chars[c-'a']++;
            i++;
        }
        // 判断"balloon"气球的出现次数
        int balloonCount=0;
        while (chars[1] >= 1 && chars[0] >= 1 && chars[11] >= 2 && chars[14] >= 2 && chars[13] >= 1) {
            balloonCount++;
            chars[1]--;
            chars[0]--;
            chars[11] -= 2;
            chars[14] -= 2;
            chars[13]--;
        }
        return balloonCount;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.println(i+"->"+(char)(97+i));
        }
    }
}
/*
    解题思路：
        0.桶计数（即一个萝卜一个坑）
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了80.40% 的用户
    内存消耗：36.9 MB, 在所有 Java 提交中击败了89.29% 的用户
 */