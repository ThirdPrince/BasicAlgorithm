package bf;

/**
 * 模式匹配
 * 暴力匹配
 * abcd
 * bcd
 */
public class BF {

    public static void main(String[] args) {


        String s = "hello  donghenglong";
        String r = "long";
        System.out.println(bfSearch(s, r));
        System.out.println(s.indexOf(r));
    }

    public static int bfSearch(String source,String target){

        if(source.length() < target.length()) return -1;

        for(int i = 0;i+target.length()<= source.length();i++){

            int j= 0;
            for(;j < target.length();j++){
                if(source.charAt(i+j) != target.charAt(j))
                    break;
            }

            if(j == target.length()) return i;
        }



        return -1;
    }

}
