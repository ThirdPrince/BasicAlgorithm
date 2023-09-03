package java_.array;

import java.util.Arrays;

/**
 * 自定义Array
 */
public class Array<E> {

    private E[] data;
    private int size;

    /**
     *
     * @param capacity
     */
    public Array(int capacity){
        data = (E[])(new Object[capacity]);
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(E e){
        if(size == data.length)
            throw new IllegalArgumentException("AddLast failed.Array is full");
//        data[size] = e;
//        size++;
        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void add(int index,E e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed.Array is full");
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed.Array index >=0 && index <= size");

        for (int i = size -1;i >= index; i--)
            data[i+1] = data[i];

        data[index] = e;
        size++;
    }

    E get(int index){
        if(index < 0 || index >=size)
            throw new IllegalArgumentException("Get failed. index is illegal ");
        return data[index];
    }

    void set(int index,E e){
        data[index] = e;
    }

   public boolean contains(E e){
        for (int i = 0;i<size;i++){
            if(data[i].equals(e) ){
                return true;
            }
        }
        return false;
   }

   public E remove(int index){
        if(index <0 || index >= size)
            throw new IllegalArgumentException("Remove failed.index is illegal");
        E ret = data[index];
        for(int i = index+1;i< size;i++)
            data[i-1] = data[i];
        size--;
        return ret;

   }

   public E removeFirst(){
        return remove(0);
   }
   public E removeLast(){
        return  remove(size-1);
   }
   public void removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }

   }

   public int find(E e){
        for(int i= 0;i<size;i++){
            if(data[i] ==e)
                return i;
        }
        return -1;
   }


    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
