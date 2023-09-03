package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,0,4};
        quickSort(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] nums,int left,int right){
        if(left >= right)
            return;
        int pivot = partition(nums,left,right);
        quickSort(nums,left,pivot-1);
        quickSort(nums,pivot+1,right);

    }

    public static int partition(int[] nums,int left,int right){
        int i = left,j = right;
        while (i < j){
            while (i < j && nums[j]>=nums[left]){
                j--;
            }
            while (i < j && nums[i]<=nums[left]){
                i++;
            }
            swap(nums,i,j);
        }
        swap(nums,i,left);
        return i;
    }
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
