/*

Problem Statement: Given the number E.g.34826 Find the greatest number
in the given number....?
Sample input: 34826
Sample output: 8

 */


package NumberProblems;

import  java.util.*;

class BigInNumber{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int max=0;
        int num= in.nextInt();
        while (num>0){
            int rem=num%10;
            if (rem>max){
                max=rem;
            }
            num=num/10;
        }
        System.out.println(max);
    }
}