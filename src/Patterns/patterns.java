package Patterns;

import java.util.*;

class Square_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class Hallow_Square_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || col == 1 || row == n || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Right_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
                ///System.out.print("col ");
                ///System.out.println("row ");
            }
            System.out.println();
        }
    }
}


class Right_Triangle_Alpha_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            char c = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(c++ + " ");
                ///System.out.print("col ");
                ///System.out.println("row ");
            }
            System.out.println();
        }
    }
}

class Right_Triangle_Alpha_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char c = 'A';
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(c + " ");
                ///System.out.print("col ");
                ///System.out.println("row ");
            }
            System.out.println();
            c++;
        }
    }
}

class Equilateral_Triangle_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class Equilateral_Triangle_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

class Equilateral_Triangle_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}



class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 0; row <= 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int NoOfSpaces = n - totalCol;
            for (int s = 0; s <= NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
