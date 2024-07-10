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

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        queue.offer(15);
        queue.add(50);

        System.out.println("Queue: "+ queue);
        System.out.println("Queue remove: "+queue.remove());
        System.out.println("New Queue: "+queue);
        System.out.println("Queue Poll: "+queue.poll());
        System.out.println("Queue: "+queue);
        System.out.println("Queue Peek: "+queue.peek());

        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.add(3);
        pq.add(4);
        pq.offer(5);
        System.out.println("PriorityQueue: "+ pq.peek());

        //DeQueue
        Deque<Integer> deQueue = new ArrayDeque<Integer>();
        deQueue.offer(10);
        deQueue.offer(20);
        deQueue.offerLast(30);
        deQueue.offerFirst(40);
        deQueue.pollLast();

        System.out.println("Deque: "+ deQueue);

        //Set
        //HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("HashSet: " + set);

        //LinkedHashSet
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();

        llset.add(10);
        llset.add(20);
        llset.add(30);
        llset.add(15);

        System.out.println("LinkedHashSet: " + llset);

        //TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(16);
        treeSet.add(40);

        System.out.println("TreeSet: "+ treeSet);

        //Map
        //HashMap
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Second",30);
        map.put("First",5);
        System.out.println("HashMap: "+map);

        //TreeMap
        TreeMap<String,Integer> tMap = new TreeMap<>();
        tMap.put("First",20);
        tMap.put("Second",5);
        System.out.println("TreeMap: "+tMap);
        System.out.println(tMap.get("First"));
        //Key
        System.out.println(tMap.keySet());
        //Value
        System.out.println(tMap.values());

        //Collections
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        myList.add(1);
        myList.add(0);

        Collections.sort(myList);
        System.out.println("Array Sorted by collections: "+myList);

        //Iterator
        for (Integer integer : myList) {
            System.out.println("List value: " + integer);

        }






    }
}
