package 周赛第5722题_截断句子.解法1;

class Solution {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(split[i]);
            if(i!=k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
