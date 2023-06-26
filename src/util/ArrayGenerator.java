package util;

import java.util.Arrays;

/**
 * 数组生成器
 */
public class ArrayGenerator {
    private ArrayGenerator(){}
    public static Integer[] generateOrderedArray(int n){
        Integer[] arr = new Integer[n];
        for(int i = 0;i<n;i++){
            arr[i] = i;
        }
        return arr;
    }

}
