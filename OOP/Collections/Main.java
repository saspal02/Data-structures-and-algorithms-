package Collections;

import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //List
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.add(2,25);

        System.out.println("List: "+ list);

        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,20);
        linkedList.add(10);
        linkedList.add(1,15);
        linkedList.remove(1);

        System.out.println("Linkedlist: "+ linkedList);

        //Vector
        Vector<String> vector = new Vector<>();
        vector.add("5");
        vector.add("10");
        vector.add("15");
        System.out.println("Vector " + vector);

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Stack: "+ stack);

        /pakist





    }
}
