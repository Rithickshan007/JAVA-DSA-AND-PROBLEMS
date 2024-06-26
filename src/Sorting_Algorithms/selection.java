package Sorting_Algorithms;
import java.util.*;

class SelectionSort{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }

        //Sorting using Selection Sort
        int len= arr.length;
        for (int i = 0; i < len-1; i++) {
            int min=i;
            for (int j=i+1;j<len;j++){
                if(arr[j]<arr[min]){
                    min=j;

                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        }


        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}