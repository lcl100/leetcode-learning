package 第989题_数组形式的整数加法.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        // 1.将A数组转换成一个字符串
        StringBuilder str = new StringBuilder();
        for (int i : A) {
            str.append(i);
        }
        // 2.再将数组转换成一个long整数
        long i = Long.parseLong(str.toString());// [9,9,9,9,9,9,9,9,9,9]
        long result = i + K;
        // 3.将相加的结果转换成字符串
        String s = String.valueOf(result);
        // 4.将生成的字符串转换成字符数组然后保存到List集合中
        char[] charArray = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (char c : charArray) {
            list.add(Integer.parseInt(String.valueOf(c)));
        }
        return list;
    }
}
/**
 * 思路：（行不通的）
 * 直接将数组转换成字符串，然后转换成整型值，直接相加，然后再将值转换成List集合
 * 该思路行不通，因为输入数非常大的时候，不能满足需求
 */
