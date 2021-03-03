package 第1089题_复写零.解法2;

class Solution {
    public void duplicateZeros(int[] arr) {
        // 1.循环数组中每个元素
        for (int i = 0; i < arr.length; i++) {
            // 2.判断元素是否为0
            if (arr[i] == 0) {
                // 3.如果元素是0，则0之后的所有元素向后移动一位，数组长度不变，最后一位抛弃掉
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // 4.同时i向后移动一位，因为存在两个0了
                i++;// 注意：这个很关键，否则后面会全是0
            }
        }
    }
}
/**
 * 思路：暴力破解
 * 如果查找一个元素是0，则将0元素之后的所有元素向后移动一个单位，最后一个元素抛弃掉
 */
