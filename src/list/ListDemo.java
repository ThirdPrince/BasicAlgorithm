package list;

import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        listNode4.next = listNode5;
        ListNode reversList = reverseBetween(listNode1,2,4);
        System.out.println(reversList.toString());
      //  System.out.println(hasCycle(reversList));


    }

    /**
     * 链表反转
     * @param head
     * @return
     */
    public static ListNode reversListNode(ListNode head){
        ListNode pre = null;
        ListNode current = head;

        while (current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;

        }

        return pre;

    }

    /**
     * 判断是否有环
     */

    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public static ListNode findCycleEntry(ListNode head){
        ListNode fastNode = null;
        ListNode slowNode = null;
        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(slowNode == fastNode){
               break;
            }
        }

        if(fastNode == null || fastNode.next == null){
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = fastNode;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;


    }

    public static ListNode reverseBetween(ListNode head,int m,int n){
        if(head == null || m> n){
            return head;
        }
        ListNode dummy = new ListNode(-1);
         dummy.next = head;
         ListNode pre = dummy;
         for(int i = 0;i< m-1;i++){
             pre = pre.next;
         }
         ListNode start = pre.next;
         ListNode end = start;

         for(int i = 0;i< n-m;i++){
             end = end.next;
         }
         ListNode next = end.next;
         end.next = null;

         reverseList(start);
         pre.next = end;
         start.next = next;

         return dummy.next;


    }

    public static void reverseList(ListNode head){

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next =pre;
            pre = cur;
            cur = next;
        }

    }
}
