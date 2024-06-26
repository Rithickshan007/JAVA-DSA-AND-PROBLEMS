package NumberProblems;

import java.util.Scanner;

class CatalanSeries {
    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nth term of Catalan series
    static long catalan(int n) {
        return factorial(2 * n) / (factorial(n + 1) * factorial(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Catalan series: ");
        int terms = scanner.nextInt();
        scanner.close();

        System.out.println("Catalan series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(catalan(i) + " ");
        }
    }
}
