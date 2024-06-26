/*
Problem Statement: Upper to Lower and Lower to Upper Conversion

 */



package StringAndProblems;

import  java.util.*;

class LowerToUpper{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        int c=(int)ch;
        System.out.println((char)(c^32));
    }
}
