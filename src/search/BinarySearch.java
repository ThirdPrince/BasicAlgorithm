package search;

import java.util.Arrays;

/**
 * 二分查找
 * @author dhl
 * @date 2023 0613
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(binarySearch(arr, 4));
        int[] arr2 = {2, 3, 5, 6};
        System.out.println(searchInsert(arr2, 4));
        int[] arr3 = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr3, 8)));

    }

    /**
     * 最基本的二分查找
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
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
        return -1;

    }


    /**
     * 查找最接近目标的数字
     * 2，3，5 6   4  返回3
     * 注意返回值
     *
     * @param arr
     * @param target leetcode 35
     *               https://leetcode.cn/problems/search-insert-position/description/
     */
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
        return left;// < 最接近
        // return -1;

    }


    /**
     * 同值最靠边
     * leetcode 34
     * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
     */

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                right = middle - 1;
            }
        }
        if (left == nums.length || nums[left] != target) {
            left = -1;
        }
        res[0] = left;


        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle +1;
            }
        }
        if (right == -1 || nums[right] != target) {
            right = -1;
        }
        res[1] = right;
        return res;

    }

}
