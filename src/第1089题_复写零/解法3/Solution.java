package 第1089题_复写零.解法3;

class Solution {
    public void duplicateZeros(int[] arr) {
        // 1.将数组处理成字符串
        String str="";
        for (int i : arr) {
            str+=i;
        }

        // 2.用"00"替换字符串中的"0"
        String result = str.replace("0", "00");

        // 3.截去超过数组长度的部分
        String finalResult = result.substring(0, arr.length);

        // 4.将字符串再转换回数组
        char[] charArray = finalResult.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            arr[i]=Integer.parseInt(String.valueOf(charArray[i]));
        }
    }
}
/**
 * 思路：
 * 将数组处理成一个字符串，然后用00替换0，并截去超过数组长度的部分
 */
