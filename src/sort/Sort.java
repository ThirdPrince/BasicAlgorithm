package sort;

import java.util.Arrays;

/**
 * 排序
 */
public class Sort {

    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 3, 4,-1,-1};
        int[] arr2 = {6, 1, 2, 3, 4,-1,-1};
        System.out.println(SortingHelper.isSorted(arr2));
        System.out.println(Arrays.toString(arr2));
        insertSort2(arr2);
        System.out.println(SortingHelper.isSorted(arr2));
       // SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr2));
        Student s1 = new Student("charlie",92);
        Student s2 = new Student("charlie2",12);
        Student s3 = new Student("charlie3",35);
        Student s4 = new Student("charlie5",44);
        Student s5 = new Student("charlie6",55);
        Student[] students = {s1,s2,s3,s4,s5};

        System.out.println(Arrays.toString(students));
        SelectionSort.sort(students);
        System.out.println(Arrays.toString(students));


    }


    /**
     * 选择排序
     * 每次从未排序找出最小值放到已排序的末尾
     * @param arr
     */
    public static void selectSort(int[] arr) {
        int length = arr.length ;
        for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
    }



    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr){

        int length = arr.length;
        for(int i = 1;i<length;i++){
            int base = arr[i], j = i-1;
            while (j >=0 && base >arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = base;
        }

    }

    /**
     * 逻辑性更强
     * @param arr
     */
    public static void insertSort2(int[] arr){

        int length = arr.length;
        for(int i = 0;i<length;i++){
            for(int j = i;j-1>=0;j--){
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }

            }
        }

    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
