package Collections;

import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        // Creating two ArrayLists of Integer type
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Adding elements to list1
        list1.add(20);
        list1.add(40);
        list1.add(50);

        // Adding an element to list2
        list2.add(70);
        list2.add(90);
        System.out.println(list2);

        // Removing an element at index 2 from list1
        list1.remove(2);
        System.out.println(list1);

        // Checking if list1 contains a value
        System.out.println(list1.contains(637));

        // Replacing the element at index 0 with 6
        list1.set(0, 6);

        // Getting the element at index 3 from list1 (Note: list1 has only 2 elements)
        Integer i = list1.get(1);
        System.out.println(i);

        // Printing the elements of list1
        System.out.println(list1);

        // Printing the size of list1
        System.out.println(list1.size());

        //Adding all elements in a list2 to list 1
        list1.addAll(list2);
        System.out.println(list1);


        LinkedList<Integer> list3=new LinkedList<>(list1);
        System.out.println(list3);

        //If the element present in the list return true
        System.out.println(list1.contains(50));


    }
}
