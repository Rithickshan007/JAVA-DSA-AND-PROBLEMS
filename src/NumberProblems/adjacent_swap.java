package NumberProblems;

import java.util.*;

class AdjacentSwap{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;
        while (num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        while (rev>0){
            System.out.print(rev%100);
            rev=rev/100;
        }
    }
}