package ZOHO;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.*;



class Changing{
    public static void main(String [] args){
//        String s="a11b4c5";
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char[] ch=s.toCharArray();
        int n=0,count=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                n=(n*10)+Integer.parseInt(String.valueOf(ch[i]));
                count++;
                for(int j=0;j<n-1;j++){
                    System.out.print(ch[i-count]);
                }
            }
            else{
                System.out.print(ch[i]);
                count=0;
                n=0;
            }
        }

    }
}

class MinCostGoldWires1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] wires = new int[N];
        for (int i = 0; i < N; i++) {
            wires[i] = scanner.nextInt();
        }
        System.out.println(minCost(wires));
    }

     static int minCost(int[] wires) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int wire : wires) {
            pq.add(wire);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
}



class MatrixFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pairsInput = scanner.nextLine().trim().split("\\s+");
        List<Pair> pairs = new ArrayList<>();
        for (String pairInput : pairsInput) {
            int count = Integer.parseInt(pairInput.substring(0, pairInput.length() - 1));
            char ch = pairInput.charAt(pairInput.length() - 1);
            pairs.add(new Pair(count, ch));
        }

        int R = scanner.nextInt();
        int C = scanner.nextInt();

        char[][] matrix = new char[R][C];
        int pairIndex = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = pairs.get(pairIndex).ch;
                pairs.get(pairIndex).count--;
                if (pairs.get(pairIndex).count == 0) {
                    pairIndex++;
                }
            }
        }


        for (char[] row : matrix) {
            System.out.println(new String(row));
        }
    }

    static class Pair {
        int count;
        char ch;

        Pair(int count, char ch) {
            this.count = count;
            this.ch = ch;
        }
    }
}


class Rotation180 {


    public static int rotateDigit(int digit) {
        return switch (digit) {
            case 2 -> 5;
            case 5 -> 2;
            case 6 -> 9;
            case 9 -> 6;
            default -> digit;
        };
    }


    public static int rotateNumber(int number) {
        int rotated = 0;
        int multiplier = 1;

        while (number > 0) {
            int digit = number % 10;
            rotated = rotated + rotateDigit(digit) * multiplier;
            multiplier *= 10;
            number /= 10;
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Rotate the number
        int X = rotateNumber(N);

        int sum = N + X;

        System.out.println(sum);
    }
}



class MinCostGoldWires2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] wires = new int[N];
        for (int i = 0; i < N; i++) {
            wires[i] = scanner.nextInt();
        }
        System.out.println(minCost(wires));
    }

    private static int minCost(int[] wires) {
        // Sort the wires in non-decreasing order
        sort(wires);

        int cost = 0;
        int n = wires.length;
        while (n > 1) {
            // Combine the two smallest wires
            int first = wires[0];
            int second = wires[1];
            int sum = first + second;
            cost += sum;

            // Shift the wires to the left to remove the first two elements
            for (int i = 2; i < n; i++) {
                wires[i - 2] = wires[i];
            }

            // Reduce the size of the array
            n--;

            // Insert the sum at the correct position to maintain sorted order
            int i;
            for (i = n - 1; i >= 0 && wires[i] > sum; i--) {
                wires[i + 1] = wires[i];
            }
            wires[i + 1] = sum;
        }
        return cost;
    }

    // Sorting function (Bubble Sort)
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


class PatternProb1
{
    public static void main(String[] args){
        int n=5;
        for(int row=n;row>=1;row--)
        {
            for(int col=n;col>=1;col--)
            {
                for(int k=1;k<=row;k++)
                {
                    System.out.print(col);
                }

            }
            System.out.println();
        }

    }
}

class VerticalPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        // Print vertically with s2 reversed
        printVertically(s1, s2);
    }

    private static void printVertically(String s1, String s2) {
        int n = Math.max(s1.length(), s2.length());

        // Iterate over each character position
        for (int i = 0; i < n; i++) {
            char c1 = (i < s1.length()) ? s1.charAt(i) : ' ';
            char c2 = (i < s2.length()) ? s2.charAt(s2.length() - 1 - i) : ' '; // Reversed index

            // Print the characters with a space in between
            System.out.println(c1 + " " + c2);
        }
    }
}




class VerticalStringWithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        // Output
        printVerticalWithReversed(s1, s2);

        scanner.close();
    }

    public static void printVerticalWithReversed(String s1, String s2) {
        // Find the length of the strings
        int lenS1 = s1.length();
        int lenS2 = s2.length();

        // Find the maximum length
        int maxLength = Math.max(lenS1, lenS2);

        // Iterate over each character
        for (int i = 0; i < maxLength; i++) {
            // Print characters from S2 in reversed order
            if (i < lenS2) {
                System.out.print(s2.charAt(lenS2 - i - 1));
            } else {
                System.out.print("*");
            }

            // Print characters from S1 vertically
            if (i < lenS1) {
                System.out.println(s1.charAt(i));
            } else {
                System.out.println("*");
            }
        }
    }
}



class MaxValue {

    public static int computeMaxValue(int num) {
        int sum = 0;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return Math.max(sum, product);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(computeMaxValue(array[i]) + " ");
        }
    }
}



class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        String num = "";
        if((int)s.charAt(0)>64)
        { for (int i = 0; i < s.length(); i++) {
            if ((int)(s.charAt(i)) >= 65 && (int)(s.charAt(i)) <= 122) {
                str += s.charAt(i);
            } else {

                num += s.charAt(i);
                if  (i==s.length()-1||(int)(s.charAt(i + 1)) >= 65 && (int)(s.charAt(i + 1)) <= 122)
                {
                    int n = Integer.parseInt(num);
                    for (int j = 0; j < n; j++) {
                        System.out.print(str);
                    }

                    str = "";
                    num = "";
                }


            }

        }}
        else{
            for (int i = 0; i < s.length(); i++) {
                if ((int)(s.charAt(i)) <= 65 ) {
                    num += s.charAt(i);

                } else {
                    str += s.charAt(i);

                    if  (i==s.length()-1||(int)(s.charAt(i + 1)) <=65)
                    {
                        int n = Integer.parseInt(num);
                        for (int j = 0; j < n; j++) {
                            System.out.print(str);
                        }

                        str = "";
                        num = "";
                    }


                }

            }
        }

    }
}

class MaxSubArray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]= in.nextInt();
        }
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i] );
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.println(maxsum);
    }
}


