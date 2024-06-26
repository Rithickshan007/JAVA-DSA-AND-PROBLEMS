package Collections;

import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        // Creating two ArrayLists of Integer type
        ArrayList<Integer> list1 = new java.util.ArrayList<>();
        ArrayList<Integer> list2 = new java.util.ArrayList<>();

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

        list1.addAll(list2);
        System.out.println(list1);


        ArrayList<Integer> list3=new ArrayList<>(list1);
        System.out.println(list3);

        System.out.println(list1.contains(50));
    }
}