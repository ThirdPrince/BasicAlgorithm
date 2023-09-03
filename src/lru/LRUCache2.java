package lru;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class LRUCache2 {

    /**
     * 双向链表
     */
    private class DLinkedNode{
        public int key;
        public int value;
        public DLinkedNode prev;
        public DLinkedNode next;

        public DLinkedNode(int key,int value){
            this.key = key;
            this.value = value;

        }
    }

    private Map<Integer,DLinkedNode> cache = new HashMap<>();

    private int size;
    private int capacity;
    private DLinkedNode head;
    private DLinkedNode tail;

    public LRUCache2(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.head = new DLinkedNode(-1,-1);
        this.tail = new DLinkedNode(-1,-1);
        this.head.prev = null;
        this.head.next = tail;
        this.tail.prev = head;
        this.tail.next = null;

    }

    public int get(int key){
        if(size == 0){
            return  -1;
        }
        DLinkedNode node  = cache.get(key);
        if(node == null){
            return  -1;
        }

        return -1;

    }

    public void addNodeAtHead(DLinkedNode node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }


}
