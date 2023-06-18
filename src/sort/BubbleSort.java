package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author dhl
 *
 */
public class BubbleSort {

    private BubbleSort(){}
    public static<E extends Comparable<E>> void sort(E[] arr){
        int length = arr.length;
        for(int i = 0; i <length;i++){
            for(int j = 0;j<length-1-i;j++){
                 if(arr[j].compareTo(arr[j+1])>0){
                     swap(arr,j,j+1);
                 }
            }
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E e = arr[i];
        arr[i] = arr[j];
        arr[j] = e;
    }

    public static void main(String[] args) {
        Integer[] integers = {3,2,4,6,1,5};
        System.out.println(Arrays.toString(integers));
        sort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
