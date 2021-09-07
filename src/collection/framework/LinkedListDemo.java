package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        ArrayList<Object> alist = new ArrayList<>(5);

        alist.add(12);
        alist.add(9);
        alist.add(8);
        alist.add(10);

        LinkedList<Object> l = new LinkedList<>(alist);

        l.add(23);
        l.add(34);

        l.add(0, -20);



        System.out.println(l.poll());
    }
}
