package merger;

import list.ListNode;

import java.util.Arrays;

public class MergerSorted {
    public static void main(String[] args) {

        int[] num1 = {1,2,0,0,0};
        int[] num2 = {-2,-3,-5};
        System.out.println(Arrays.toString(num1));
        mergerSortedArrays(num1,2,num2,3);
        System.out.println(Arrays.toString(num1));

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = mergerSortedList(listNode1, listNode3);
        System.out.println(listNode.toString());



    }

    /**
     * 合并两个数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void mergerSortedArrays(int[] nums1,int m,int[] nums2,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i >=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }

        }
        System.out.println("----");

        while(j >=0){
            nums1[k--] = nums2[j--];
        }
    }


    /**
     * 合并链表
     * @param listNode1
     * @param listNode2
     * @return
     */
    public static ListNode mergerSortedList(ListNode listNode1,ListNode listNode2){

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(listNode1 != null && listNode2 != null){
            if(listNode1.val < listNode2.val){
                cur.next = listNode1;
                listNode1 = listNode1.next;
            }else {
                cur.next = listNode2;
                listNode2 = listNode2.next;
            }
            cur = cur.next;
        }

        if(listNode1 != null){
            cur.next = listNode1;
        }

        if(listNode2 != null){
            cur.next = listNode2;
        }

       return dummy.next;
    }
}
