package 第66题_加一.解法1;

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){// 倒序循环遍历每个元素
            digits[i]++;// 数字无论是9还是非9都先加1，后面会进行处理
            digits[i]=digits[i]%10;// 如果是非9元素加1后对10取模，仍然是该数；如果是9加上1为10，对10取模，则为0，表示发生了进位
            if(digits[i]!=0){// 如果没有发生进位，只是简单的加1
                return digits;// 直接返回
            }
        }
        digits=new int[digits.length+1];// 表示如99、999这样的数发生了进位，数组再加1位
        digits[0]=1;// 并且最高位为1，其他位为0
        return digits;
    }
}
/**
 * 思路：https://leetcode-cn.com/problems/plus-one/solution/java-shu-xue-jie-ti-by-yhhzw/
 * 该算法思路异常的巧妙。
 */