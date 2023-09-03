package prefix;

public class Solution {
    public static void main(String[] args) {


        String[] strings= {"err11","1err","2errrrc","abc","jjjj"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
            while (strs[i].indexOf(prefix)!= 0){
                prefix = prefix.substring(0,prefix.length()-1);
                //System.out.println(prefix);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
