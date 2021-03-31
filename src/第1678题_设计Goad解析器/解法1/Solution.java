package 第1678题_设计Goad解析器.解法1;

class Solution {
    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
/*
    解题思路：
        0.API和正则表达式
        1.直接用replaceAll()方法替换所有的"()”和"(al)"
    总结：
        1.使用String的正则表达式替换，效率有限
 */
/*
    执行用时：6 ms, 在所有 Java 提交中击败了5.85% 的用户
    内存消耗：37.8 MB, 在所有 Java 提交中击败了5.12% 的用户
 */