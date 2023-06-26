package temp;

import java_.array.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("22222");
        list.add(0,"44444");
        System.out.println(list);
        Array array = new Array();
        array.addLast(2);
        System.out.println(array);
    }
}
