package 第1528题_重新排列字符串.解法1;

class Solution {
    public String restoreString(String s, int[] indices) {
        // 1.创建一个新数组来存储每个字符应该放的正确位置
        char[] newArr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            newArr[indices[i]] = s.charAt(i);
        }
        // 将字符数组转换成字符串返回
        return new String(newArr);
    }
}
/*
    解题思路：
        0.新数组
        1.按照下标重新赋值到新数组
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了88.35% 的用户
 */