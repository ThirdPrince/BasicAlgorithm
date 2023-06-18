package sort;

/**
 * 选择排序泛型版本
 */
public class SelectionSort {
    private SelectionSort(){};
    public static <E extends Comparable<E>> void sort(E[] arr){
        int length = arr.length ;
        for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].compareTo(arr[minIndex])< 0) {
                    minIndex = j;
                }
            }
            if(i != minIndex){
                E temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
    }

}
