package 第125题_验证回文串.解法4;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(String s) {
        // 1.忽略大小写
        String upperStr = s.toUpperCase();
        char[] chars = upperStr.toCharArray();
        // 2.创建一个栈
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for (char c : chars) {
            if(c>='0'&&c<='9'||c>='A'&&c<='Z'){
                // 将元素入栈
                stack.push(c);
                // 只保存是数字或字母的字符，清理掉哪些无效的字符
                sb.append(c);
            }
        }
        char[] newChars = sb.toString().toCharArray();
        int i=0;// 让newChars数组元素移动的指针
        while (!stack.empty()){
            // 然后将出栈元素与原字符串元素比较
            if(stack.pop()!=newChars[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
/*
    解题思路：
        1.利用栈的特效：先进后出。例如：入栈是[A,B,C,D]，出栈是[D,C,B,A]，那么正好可以和原字符串进行比较
 */