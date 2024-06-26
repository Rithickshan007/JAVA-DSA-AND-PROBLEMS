package BitwiseAndMathematics;

import  java.util.*;

//Left Shift
//Formula a<<1=2a
class Bitwise_1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(a<<1); //Any Number left shift gives 2a of the number
    }
}
//Left Shift
//Formula a<<b= a*2 pow b
class Bitwise_2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println(a<<b);
    }
}
//Odd or Even using Bitwise
class Bitwise_3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(((a&1)==1)?"Odd":"Even");
    }
}

//Problem: Find the one single Member in the group of committed Members

class Bitwise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int single = 0;
        for (int j : a) {
            single = single ^ j;
        }
        System.out.println(single);
    }
}


//Problem: No. of Set Bits(1) in a Number

class Bitwise_5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        int count=0;
        while (a>0){
            if ((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }
}


class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
                System.out.print(number);
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
        System.out.println(1<<(numRows-1));
        scanner.close();
    }
}



class Bitwise_6{
    public static void main(String[] args) {
        int a=-3;
        int b=5;
        int c=a>>b;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}



class Bitwise_7
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        int c=ch;

        System.out.print((char)(c^32));
    }
}


class Bitwise_8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        System.out.println(((a&1)==1)?"Odd":"Even");
    }
}

class Bitwise_9{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        int d=(int)a;
        int c=d^32;
        System.out.println((char) c);

//        if(d>=65&&d<=90){
//            int n=d+32;
//            System.out.println((char)n);
//        } else if (d>=97&&d<=122) {
//            int n=d-32;
//            System.out.println((char)n);
//        }else{
//            System.out.println("Invalid Charecter");
//        }
    }
}

class FlipImage {
    public static void main(String[] args) {
        // Input: 2D binary array
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        // Dimensions of the array
        int rows = image.length;
        int cols = image[0].length;

        // Flipping and inverting the image
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (cols + 1) / 2; j++) {
                int arr= image[i][j];
                int temp =arr^ 1;
                int arr2=image[i][j];
                 arr2= image[i][cols - j - 1] ^ 1;
                 int arr3= image[i][cols - j - 1];
                        arr3 = temp;
            }
        }

        // Printing the output
        for (int[] row : image) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==1){
            return true;
        }
        if(s.length()!=goal.length()){
            return false;
        }
        int count = 0;
        while(count<s.length()){
            s=s.substring(1);
            if(Objects.equals(s, goal)){
                return true;
            }
            count++;
        }
        return false;
    }
}









