package NumberProblems;
import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        int count ;

        // Count the number of digits
        int t = N;
//        while (t > 0) {
//            t = t / 10;
//            count++;
//        }
        count=(int)Math.log10(N)+1;
        System.out.println("Count: " + count);

        // Calculate the Armstrong sum
        t = N;
        while (t > 0) {
            int digit = t % 10;
//            int power = 1; // For without using Math.pow function
//            for (int i = 0; i < count; i++) {
//                power = power * digit;
//            }
            sum += (int)Math.pow(digit,count);
            t = t / 10;
        }

        System.out.println(sum);
        System.out.println((N == sum) ? "Armstrong" : "Not Armstrong");
    }
}

//Armstrong number or not using functions
class Armstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = countDigits(N);
        System.out.println(count);

        int sum = isArmstrong(N, count);
        
        System.out.println((N == sum) ? "Armstrong" : "Not Armstrong");
    }
    static int countDigits(int num){
        num=(int)Math.log10(num)+1;
        return num;
    }

    static int isArmstrong(int num,int count){
        int sum=0;
        while(num>0){
            int digits=num%10;
            sum+=(int)Math.pow(digits,count);
            num/=10;
        }
        return sum;
    }
}






class Armstrong2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = countDigits(n);

        boolean isArmstrong = isArmstrong(n, count);

        System.out.println((isArmstrong) ? "Armstrong" : "Not Armstrong");
    }

    static int countDigits(int num) {
        return (int) Math.log10(num) + 1;
    }

    static boolean isArmstrong(int num, int count) {
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (int)Math.pow(digit, count);
            num /= 10;
        }
        return sum == temp;
    }
}


class ArmstrongMethod{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=countDigit(n);
        System.out.println(count);
        boolean isArmstrong=isArmstrong(n,count);
        System.out.println((isArmstrong)?"Yes":"No");
    }
    static int countDigit(int num){
        return (int)Math.log10(num)+1;
    }
    static boolean isArmstrong(int num,int count){
        int temp=num;
        int sum;
        sum = 0;
        while(num>0){
            int digit=num%10;
            sum+=(int)Math.pow(digit,count);
            num/=10;
        }
        return sum==temp;
    }
}





















