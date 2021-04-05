package 周赛第5708题_统计一个数组中好对子的数目.解法1;

class Solution {
    public int countNicePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    String s1 = sum(String.valueOf(nums[i]), rev(nums[j]));
                    String s2 = sum(rev(nums[i]), String.valueOf(nums[j]));
                    if (s1.equals(s2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private String sum(String num1, String num2) {
        if (num1.length() > num2.length()) {
            int len = num1.length() - num2.length();
            StringBuilder num2Builder = new StringBuilder(num2);
            for (int i = 0; i < len; i++) {
                num2Builder.insert(0, "0");
            }
            num2 = num2Builder.toString();
        } else if (num1.length() < num2.length()) {
            int len = num2.length() - num1.length();
            StringBuilder num1Builder = new StringBuilder(num1);
            for (int i = 0; i < len; i++) {
                num1Builder.insert(0, "0");
            }
            num1 = num1Builder.toString();
        }
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars1.length; i++) {
            int n1 = Integer.parseInt(String.valueOf(chars1[i]));
            int n2 = Integer.parseInt(String.valueOf(chars2[i]));
            sb.append(n1 + n2);
        }
        return sb.toString();
    }

    private String rev(int x) {
        String s = String.valueOf(x);
        return new StringBuilder(s).reverse().toString();
        /*char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            char temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp;
        }
        return new String(chars);*/
    }

    public static void main(String[] args) {
        System.out.println((int) (('7' + '2')));
    }
}
// 42+79=4279
// 97+24=9724
/*
    超出时间限制
 */