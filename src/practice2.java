import java.util.Scanner;

//class WeirdCity {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
////        // Input numbers n and m
////        int n = scanner.nextInt();
////        int m = scanner.nextInt();
////
////        // Perform weird operation
////        int result = weirdOperation(n, m);
////        System.out.println(result);
////
////        scanner.close();
////    }
////
////    // Method to perform the weird operation
////    public static int weirdOperation(int n, int m) {
////        int result = m - (2 + n);
////        return result % m; // Applying mod operation as subtraction means mod
//        double count = Math.log10(1000);
//        System.out.println(count);
//    }
//}
//
//
//class Main
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String []date=sc.next().split("/");
//        int d=Integer.parseInt(date[0]);
//        int m=Integer.parseInt(date[1]);
//        int y=Integer.parseInt(date[2]);
//        boolean isValid = true;
//        int maxDays = switch(m)
//        {
//            case 2: yield (y%4==0 && y%100!=0 || y%400==0)?29:28;
//            case 4,6,9,11:yield 30;
//            default: yield 31;
//
//        };
//    }
//
//}


import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int n, r, c;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                if (r==0 || r==n-1 || c==0 || c==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}






class Greaater3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}

class EBBill{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double unit=in.nextDouble();
        double cost=0;

    }
}



class Switch{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        int n=in.nextInt();
        int m=in.nextInt();
        switch(a){
            case '+':
                System.out.print(n+m);
                break;
            case '-':
                System.out.println(n-m);
                break;
            case '*':
                System.out.println(n*m);
                break;
            case '/':
                System.out.println(n/m);

                default:
                System.out.print("Invalid Operation");
        }
    }
}















