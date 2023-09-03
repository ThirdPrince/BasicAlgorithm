package compare;

public class Compare {

    public static void main(String[] args) {
        String version1 = "1.2.0.0";
        String version2 = "1.0.2.0";
        System.out.println(compare(version1,version2));


    }

    public static int compare(String version1,String version2){
        int n1 = version1.length();
        int n2 = version2.length();
        int i = 0;int j = 0;
        while (i < n1 || j < n2){
            long num1 = 0;
            while(i < n1 && version1.charAt(i) != '.'){
                num1 = num1 *10 +(version1.charAt(i) -'0');
                i++;
            }
            i++;
            long num2 = 0;
            while(j < n2  && version2.charAt(j)!= '.'){
                num2 = num2 * 10 + (version2.charAt(j)-'0');
                j++;
            }
            j++;
            if(num1 > num2){
                return 1;
            }
            if(num1 < num2){
                return -1;
            }
        }
        return 0;
    }
}
