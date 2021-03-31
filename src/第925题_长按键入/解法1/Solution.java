package 第925题_长按键入.解法1;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();
        while (j < typedChars.length) {
            if (i < nameChars.length && j < typedChars.length && nameChars[i] == typedChars[j]) {
                i++;
                j++;
            } else if (j > 0 && typedChars[j] == typedChars[j - 1]) {// j>0的情况是针对如"a"和"b"
                j++;
            } else {
                return false;
            }
        }
        return i == nameChars.length;// 处理如"alexd"和"ale"的情况
    }
}
/*
    解题思路：
        0.双指针
        1.循环判断两个字符串中的对应i指针和j指针的字符
            如果name[i]等于typed[j]，表示两根字符相等，属于键入的正常情况，那么i++，j++
            如果name[i]不等于typed[j]，必须考虑这种情况：typed[j]等于typed[j-1]表示typed[j]字符被长按了，也属于键入的正常情况，不应该返回false
            如果name[i]不等于typed[j]并且typed[j]不等于typed[j-1]表示该字符不存在与name中，返回false
            注意i和j的边界情况，防止索引越界
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了65.70% 的用户
 */