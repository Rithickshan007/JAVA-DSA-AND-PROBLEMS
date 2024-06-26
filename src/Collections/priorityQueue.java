package Collections;

import java.util.PriorityQueue;
class Priorityqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> s1= new PriorityQueue<>();
        s1.add(45);
        s1.add(95);
        s1.add(85);
        s1.add(100);
        System.out.println(s1);
        System.out.println(s1.peek());// Peek()-Display the head of the element
        System.out.println(s1);
        System.out.println(s1.remove());// remove()-remove head element if list is empty return exception
        System.out.println(s1);
        System.out.println(s1.poll());//poll()-remove head element if list is empty return null
        System.out.println(s1);
        System.out.println(s1.poll());
        System.out.println(s1);
        System.out.println(s1.poll());
        System.out.println(s1);
        System.out.println(s1.poll());
    }
}
