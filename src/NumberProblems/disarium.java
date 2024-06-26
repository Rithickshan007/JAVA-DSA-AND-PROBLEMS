package NumberProblems;
import java.util.*;

class Disarium {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        int sum = 0;
        int temp = number;
        int count;

        count=(int)Math.log10(number)+1;

        // Reset temp to the original number
        int t=temp;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
            count--;
        }

        System.out.println(sum);
        System.out.println((t == sum) ? "Disarium" : "Not Disarium");
    }
}
