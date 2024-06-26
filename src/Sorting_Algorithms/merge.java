//Merge Sort Algorithm


package Sorting_Algorithms;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,6};
        int size = arr.length;

        // Display an array before sorting
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Merge Sort implementation within main
        int[] temp = new int[size];
        int start = 0;
        int end = size - 1;
        mergeSort(arr, temp, start, end);

        // Display array after sorting
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid + 1, end);

            int i = start; // starting k of start sub-array
            int j = mid + 1; // starting k of end sub-array
            int k = start; // used to place items in temp[]

            while (i <= mid && j <= end) {
                // place the smaller item at temp[k]
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }

            while (i <= mid) {
                temp[k] = arr[i];
                k++;
                i++;
            }

            while (j <= end) {
                temp[k] = arr[j];
                k++;
                j++;
            }

            // Copy temp[] to original array arr[]
            for (int p = start; p < k; p++) {
                arr[p] = temp[p];
            }
        }
    }
}
