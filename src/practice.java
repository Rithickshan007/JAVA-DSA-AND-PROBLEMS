import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;


import java.util.*;

class Joseph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 1;
        for (; n >= i; i = i << 1) ;
        n = n - (i >> 1);
        System.out.print((n * 2) + 1);
    }
}


class Vehicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), w = sc.nextInt();
        int tw = ((4 * v) - w) / 2;
        if (w >= 2 && (w % 2 == 0) && w > v)
            System.out.printf("tw= %d fw= %d", tw, v - tw);
        else
            System.out.println("invalid");
    }
}


class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] binaryNum = new int[n];
        int i;
        for (i = 0; n > 0; i++) {
            binaryNum[i] = n % 2;
            n = n / 2;
        }
        for (int j = i - 1; j >= 0; j--) { //Reversing the array
            System.out.print(binaryNum[j]);
        }
    }
}


class DecimalToBinary2 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            int n = num;
            int[] binaryNum = new int[32];
            int i = 0;
            while (n > 0) {
                binaryNum[i] = n % 2;  //10-0 1
                n = n / 2;
                i++;
            }
            System.out.print(num);
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(binaryNum[j]);
            }
            System.out.println();
        }
    }
}







class Bitwise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(((a & 1) == 1) ? "Odd" : "Even");
    }
}


class AppleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i)
            ar[i] = sc.nextInt();
        int a = ar[1] - ar[0];
        int b = ar[2] - ar[1];
        int diff = (a < b) ? a : b;
        for (int i = 0; i < n - 1; ++i)
            if ((ar[i + 1] - ar[i]) > diff) {
                System.out.print(ar[i] + diff);
                break;
            }
    }
}


class DoorProblem{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long d=in.nextLong();
        long k=1;
        while(true){
            long temp=k;
            long key=0;
            long mul=1;
            while(temp!=0){
                key=key+(temp&1)*9*mul;
                mul=mul*10;
                temp=temp>>1;
            }
            if (key%d==0){
                System.out.println(key);
                break;
            }
            k++;
        }
    }
}
