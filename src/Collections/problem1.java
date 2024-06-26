package Collections;

import java.util.LinkedHashSet;
import  java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

class  problem{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        LinkedList<Integer>l1= new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();

        for (int i = 0; i < n; i++) {
            l1.add(in.nextInt());
        }
        for (int i = 0; i <m; i++) {
            l2.add(in.nextInt());
        }
        l1.addAll(l2);
        System.out.println(l1);

        LinkedHashSet<Integer>l3= new LinkedHashSet<>(l1);
        System.out.println(l3);

        TreeSet<Integer>l4 = new TreeSet<>(l3);// Tree Set uses Inorder Traversal L-RN-R
        System.out.println(l4);
    }
}