package  NumberProblems;

import java.util.Scanner;

//O(Root of N) Complexity
import java.util.Scanner;

class PrimeOrNot1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean isPrime = true;

        if (num <2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}


//O(N) Time Complexity
//By using the break statement

class  PrimeOrNot2{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime" : "not Prime");
    }
}

class  PrimeOrNot3{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                System.out.println(i);
            }
        }

        System.out.println(isPrime ? "Prime" : "not Prime");
    }
}


//Finding the prime number in the given range

class PrimeInRange{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        for (int i = start; i <end ; i++) {
            if(i<2){
                continue;
            }
            boolean isPrime=true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}



class Prime_Factors {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                int x = n;
                while(x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }
}



