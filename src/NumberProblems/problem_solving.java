package NumberProblems;
import  java.util.*;

//Conditional Statements and problems


//The Tamilnadu Electricity board announced the new tarrif for People
//The first 100 units are charged at ₹1.5 per unit.
//The next 100 units (101 to 200) are charged at ₹2 per unit.
//Any units beyond 200 are charged at ₹3 per unit.
// Calculate the electricity bill for a residential customer
import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        double bill=0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2;
        } else {
            bill = 100 * 1.5 + 100 * 2 + (units - 200) * 3;
        }

        System.out.println("₹" + bill);
    }
}

//Write the program to calculate the number of days in a
// Month with the help of new Switch case statement

class SwitchNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        int year = in.nextInt();

        int result = switch (month) {
            case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
            case "APR", "JUN", "SEP", "NOV" -> 30;
            case "FEB" -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->0;
        };//End of the enhanced switch statement should be terminated by semicolon

        System.out.println("In year " + year + " in month " + month + " there are " + result + " days.");
    }
}



//Write the calculator program using a new switch case statement
class Calculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String operation=in.nextLine();
        int n1=in.nextInt();
        int n2= in.nextInt();
        int result=switch (operation){
            case "ADD"->n1+n2;
            case "SUB"->n1-n2;
            case "MUL"->n1*n2;
            case "DIV"->{
                if(n2==0){
                    yield 0;
                }
                yield n1/n2;
            }
            default -> throw new IllegalArgumentException("invalid operation");
        };
        System.out.println(result);
    }
}

//Greatest digit in the given number:
//Sample input: 345683
//Sample output: 8

class LargeInteger{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int max=0;
        for(int temp=n;temp>0;temp=temp/10){
            int rem=temp%10;
            if(rem>max){
                max=rem;
            }
        }
        System.out.println(max);
    }
}


class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bin_num = sc.nextInt();
        int decimal = 0;
        int power = 1;

        for (long tempBinary = bin_num; tempBinary > 0; tempBinary /= 10) {
            long temp = tempBinary % 10;
            decimal += (int) (temp * power);
            power *= 2;
        }

        System.out.print(decimal);
    }
}
class NoOfSetBits{
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
        System.out.print(count);
    }
}

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] binary = new long[n];
        long i;
        for (i = 0; n > 0; i++) {
            binary[(int) i] = n % 2;
            n = n / 2;
        }
        for (long j = i - 1; j >= 0; j--) { //Reversing the array
            System.out.print(binary[(int) j]);
        }
    }
}






class GreaterNum{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//3248
        int max=0;              //324
        for(int temp=n;temp>0;temp=temp/10){
            int digit=temp%10;//8
            if(digit>max){
                max=digit;
            }
        }
        System.out.println(max);
    }
}



//Binary to Decimal Conversion
class BinToDec{
    public static void main(String[] args) {   //0
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int decimal=0;
        int power=0;
        for(long temp=n;temp>0;temp/=10){
            long rem=temp%10;
            decimal+=(int)(rem*Math.pow(2,power));
            power++;
        }
        System.out.println(decimal);
    }
}

//Array Declaration Basic Syntax
class ArraysEx{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();     //{1,2,3,4,5}
        int []arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}


//Find the duplicates in array and print the elements

//{1,2,3,4,5,6,5,1}
//Reverse


//Decimal to binary conversion






















class Basic{
    void main(){
        System.out.println("Hello world");
    }
}





















