package Sorting_Algorithms;

//Binary Search Algorithm and Problem


//Binary Search Algorithm
import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();        //{1,2,3,4,5,6,7}
        }
        BubbleSort(arr);
        System.out.println("Enter Target");
        int target=in.nextInt();            //target=6
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

    }
    public static void BubbleSort(int[] arr){
        int len= arr.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

//Problem NO: 1- Find the ceiling of a Number
class Ceiling{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        InsertionSort(arr);
        int ans=BinarySearch(arr,18);
        System.out.println(ans);
    }
    public static int BinarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                return -1;
            }
        }
        return arr[start];
    }
    public static void InsertionSort(int[]arr){
        int len= arr.length;
        for (int i = 1; i <len ; i++) {
            int key=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}

//Problem NO:2- Smallest Letter in an array
class SmallestArray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char[] ch=new char[n];
        for (int i = 0; i < ch.length; i++) {
            ch[i]=in.next().charAt(i);
        }
        char res=SmallLetter(ch,'q');
        System.out.println(res);
    }
    static char SmallLetter(char []arr, char target){
        int start=0;
        int end =arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start% arr.length];
    }
}









class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int target = s.nextInt();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==target){
                System.out.print(i);
            }
        }
    }
}

