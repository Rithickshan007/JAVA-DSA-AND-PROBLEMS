package NumberProblems;

import java.util.*;

class HarshadNumber{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int res=0;
        int temp=N;

        while (N!=0){
            int rem=N%10;
            res=res+rem;
            N=N/10;
        }
        System.out.println(res);
        System.out.println((temp%res==0)?"Harshad" :"Not Harshad");
    }
}