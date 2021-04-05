package 周赛第5706题_句子相似性III.解法1;

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] split1 = sentence1.split(" ");
        String[] split2 = sentence2.split(" ");
        if(split1.length==split2.length){
            return sentence1.equals(sentence2);
        }
        if(split1.length==1&&split2.length>1){
            String[] split = sentence2.split(" ");
            return sentence1.equals(split[0])||sentence1.equals(split[split.length-1]);
        }
        if(split1.length>1&&sentence2.split(" ").length==1){
            String[] split = sentence1.split(" ");
            return sentence2.equals(split[0])||sentence2.equals(split[split.length-1]);
        }
        if(sentence1.startsWith(sentence2)||sentence1.endsWith(sentence2)||sentence2.startsWith(sentence1)||sentence2.endsWith(sentence1)){
            return true;
        }
        if(split2.length<split1.length){
            int i=0;
            while (i<split2.length){
                if(split1[i].equals(split2[i])){
                    i++;
                }else {
                    break;
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int m=i;m<split2.length;m++){
                sb.append(split2[m]).append(" ");
            }
            return sentence1.endsWith(sb.toString().trim());
        }

        return split1[0].equals(split2[0])&&split1[split1.length-1].equals(split2[split2.length-1]);
    }

}