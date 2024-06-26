package Collections;

import java.util.LinkedList;
import  java.util.Queue;
class queue{
    public static void main(String[] args) {
        Queue<Integer> s1= new LinkedList<>();
        s1.add(45);
        s1.add(95);
        s1.add(85);
        s1.add(100);
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.remove());
        System.out.println(s1);
        System.out.println(s1.poll());
        System.out.println(s1);
        System.out.println(s1.poll());
        System.out.println(s1);
        System.out.println(s1.poll());
        System.out.println(s1);
        System.out.println(s1.poll());
    }
}
