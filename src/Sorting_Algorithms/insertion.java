package Sorting_Algorithms;

import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();  //{4,3,6,8,10,1}
        }

        //Sorting using Insertion Sort

        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];//key=4
            int j = i - 1;//0

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  //3,4,6,8,10,1
                j = j - 1;//j=-1
            }
            arr[j + 1] = key;//
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
