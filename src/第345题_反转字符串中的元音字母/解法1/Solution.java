package 第345题_反转字符串中的元音字母.解法1;

public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        int j=chars.length-1;
        while (i<j){
            // 判断i指针所指向的元素是否是元音字母，不是则将i指针持续向前推动
            while (!(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'||
                    chars[i]=='A'||chars[i]=='E'||chars[i]=='I'||chars[i]=='O'||chars[i]=='U')){
                i++;
                // 处理特殊情况，即整个字符串都没有元音字母，例如：[.,]
                if(i==chars.length){
                    return s;
                }
            }
            // 判断j指针所指向的元素是否是元音字母，不是则将j指针持续向前推动
            while (!(chars[j]=='a'||chars[j]=='e'||chars[j]=='i'||chars[j]=='o'||chars[j]=='u'||
                    chars[j]=='A'||chars[j]=='E'||chars[j]=='I'||chars[j]=='O'||chars[j]=='U')){
                j--;
            }
            // 交换chars[i]和chars[j]的值
            if(i<j){
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
            }
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels(".,"));
    }
}
/*
    解题思路：
        1.双指针，分别指向数组头和数组尾
        2.向中间遍历移动指针，如果不是元音字母则向前移动指针，如果是元音字母，则交换两指针所指向的字符
 */