package ZOHO;


import java.util.Arrays;
import java.util.Scanner;

class MonkeyEatingBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //No. of piles
        int n = in.nextInt();  //n=4
        int[] pile = new int[n]; //{7, 15, 6, 3}
        for (int i = 0; i < pile.length; pile[i++] = in.nextInt()) ;
        //getting hours
        int h = in.nextInt();
        //Finding the max element in array
        int maxpile = 0;
        for (int i = 0; i < n; i++) {
            if (pile[i] > maxpile) {
                maxpile = pile[i];  //maxpile=15
            }
        }
        //Binary search algorithm
        int start = 1;//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        int end = maxpile;
        while (start < end) {
            int mid = start + (end - start) / 2;  //8
            //finding hours
            int totalHours = 0; //h=10
            for (int j = 0; j < n; j++) {
                totalHours += Math.round((float) pile[j] / mid);
            }
            if (totalHours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
}


//Binary Search Algorithm
//1. linear-O(N)-Unsorted
//2.Binary-O(n Log N)- Sorted

class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //Working
        //{1,2,3,4,5,6,7,8,9}-sorted target=3>5
        Arrays.sort(arr);// Not recommended
        int target = in.nextInt();
        int start = 0;//start=6
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //mid=7
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n];
        int[] l = new int[n];
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            e[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int person=0;
        for(int i=0;i<n;i++)
        {
            person=person+e[i];
            person=person-l[i];
            p[i]=person;
        }
        for(int i=0; i<p.length; i++) {
            System.out.print(p[i]+" ");
        }
        System.out.println();
        int index=0;
        int max=0;
        for(int i=1;i<p.length;i++)
        {
            if(max<p[i])
            {
                max=p[i];
                index=i;
            }
        }
        System.out.println(p[index]);
        System.out.println(index+1);
    }
}





















