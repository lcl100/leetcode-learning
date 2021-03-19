package 面试题_01_04_回文排列.解法4;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        // 将字符串转换成字符数组并进行排序
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        Stack<Character> stack = new Stack<>();
        // 循环遍历chars数组中的元素
        int i = 0;
        while (i < chars.length) {
            // 判断栈是否为空，如果栈为空则需要添加元素入栈，才能进行比较操作，如果栈不为空那么进行比较
            if (stack.isEmpty()) {
                // 栈为空，添加当前正在遍历的元素入栈
                stack.push(chars[i]);
            } else {
                // 栈不为空，则将栈顶元素与当前正在遍历的元素进行比较
                /*
                    peep()和pop()都可以获取栈顶元素，不过peep()不会删除栈顶元素，pop()会删除
                 */
                if (stack.peek() == chars[i]) {
                    // 如果相等则将栈顶元素出栈
                    stack.pop();
                } else {
                    // 如果不相等则将当前元素入栈，成为新的栈顶元素
                    stack.push(chars[i]);
                }
            }
            i++;
        }
        // 最后根据栈中的元素来判断是否是回文串
        // 栈为空的情况例如：['a','a','b','b']
        // 栈有一个元素的情况例如：['a','b','c','b','a']
        return stack.isEmpty() || stack.size() == 1;
    }
}
/*
    解题思路：
        0.栈
        1.将字符串转换成字符数组，然后将字符数组排序
        2.在栈为空时元素入栈，然后判断当前正在遍历的元素是否等于栈顶元素，如果相等则将栈顶元素出栈，如果不相等则将元素入栈，因为相同的元素会相互抵消
        3.如['a','a','b']，那么一个'a'在栈中，另一个'a'正在遍历，进行比较相等则会将元素出栈，同时继续下一轮遍历，所以两个元素相互抵消了，所以最后栈为空或只有一个元素就是回文串
        思路来源：https://leetcode-cn.com/problems/palindrome-permutation-lcci/solution/yi-dong-pan-duan-hui-wen-chuan-li-yong-k-4zzw/
        与这种思路有异曲同工之妙：https://leetcode-cn.com/problems/palindrome-permutation-lcci/solution/shi-yong-setru-guo-yi-jing-zai-setli-jiu-remove-mi/
        都是利用相同的情况进行碰撞消除，最后对剩下的结果作判断处理
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了64.51% 的用户
    内存消耗：36.4 MB, 在所有 Java 提交中击败了15.23% 的用户
 */