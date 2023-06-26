package temp;

/**
 * temp 测试一些算法
 */
public class Algorithm {

    private Algorithm(){}

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8};
        System.out.println(binarySearch2(arr, 9));

        Integer[] integers = {1,2,4,6,7,8};

        System.out.println(binarySearch(integers, 4));

    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int middle = left + (right-left)/2;
            if(arr[middle] < target){
                left = middle +1;
            }else if(arr[middle] >target){
                right = middle-1;
            }else {
                return middle;
            }
        }
        return -1 ;
    }

    public static int binarySearch2(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int middle = left + (right-left)/2;
            if(arr[middle] < target){
                left = middle +1;
            }else if(arr[middle] >target){
                right = middle-1;
            }else {
                return middle;
            }
        }
        return left ;
    }


    public static<E extends Comparable<E>> int binarySearch(E[] arr, E e){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int middle = left + (right-left)/2;
            if(arr[middle].compareTo(e) < 0){
                left = middle +1;
            }else if(arr[middle].compareTo(e)>0){
                right = middle-1;
            }else {
                return middle;
            }
        }
        return -1 ;
    }

    public static int searchInsert(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target < arr[middle]) {
                right = middle - 1;
            } else if (target > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }

        }
        if(left >0){
            return arr[left-1];
        }
        return arr[left];// < 最接近
        // return -1;

    }
}
