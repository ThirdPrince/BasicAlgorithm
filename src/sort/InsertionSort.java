package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 在有序的情况下，时复杂度O(N)
 * @author dhl
 *
 */
public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 插入进阶
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortAdvance(E[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            E t = arr[i];
            int j ;
            for ( j = i; j - 1 >= 0 && t.compareTo(arr[j-1])<0; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = t;
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E e = arr[i];
        arr[i] = arr[j];
        arr[j] = e;
    }

    public static void main(String[] args) {
        Integer[] integers = {3, 2, 1, 6, 7, 8, 4};
        sortAdvance(integers);
        System.out.println(Arrays.toString(integers));
    }

}
