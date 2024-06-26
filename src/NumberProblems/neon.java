
//Neon Number or Not

/*
What is Neon Number?

        Neon number is the Number that the square of the number
        is equal to the sum of the digits in its square value.

        Algorithm:
            1.square the given input value
            2.Add the individual digits of the obtained square number
            3.if the input and obtained values are same return "Neon" else "Not Neon"
*/


package NumberProblems;

import  java.util.*;

class  Neon{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N= in.nextInt();
        int sq,sum=0;
        sq=N*N;
        while (sq > 0)
        {
            sum = sum + (sq % 10);
            sq = sq / 10;
        }
        System.out.println((sum==N)?"Neon":"Not Neon");
    }
}