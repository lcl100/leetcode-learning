package 第125题_验证回文串.解法2;

public class Solution {
    public boolean isPalindrome(String s) {
        // 1.忽略大小写
        String ignoredUpperStr = s.toUpperCase();
        char[] chars = ignoredUpperStr.toCharArray();
        // 2.双指针，i从数组头开始，j从数组尾开始
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            // 如果i指针历的元素是非字母数字，那么直接指针向前跳
            while (!(chars[i] >= '0' && chars[i] <= '9' || chars[i] >= 'A' && chars[i] <= 'Z')) {
                i++;
                if(i>=chars.length){// 处理特殊情况，如：[.,]这种只有非数字字母的情况
                    return true;
                }
            }
            // 如果j指针遍历的元素是非字母数字，那么直接指针向前跳
            while (!(chars[j] >= '0' && chars[j] <= '9' || chars[j] >= 'A' && chars[j] <= 'Z')) {
                j--;
            }
            // 执行到这，表示数组元素要么是字母，要么是数字
            if (chars[i] == chars[j]) {
                // 如果相等，表示满足回文条件，那么i指针和j指针向前移动，比较下一对
                i++;
                j--;
            } else {
                // 如果不相等，表示不满足回文条件，直接返回false即可
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(",."));
    }
}
/*
    解题思路：
        双指针，效率更高
 */