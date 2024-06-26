package NumberProblems;

import java.util.Scanner;

class Amicable{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int s1=factOfNums(n1);
        int s2=factOfNums(n2);
        System.out.println((s1==n2&&s2==n1)?"Yes":"No");
    }
    static int factOfNums(int num){
        int sum=0;
        for (int i = 1; i <num ; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}