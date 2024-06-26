/*

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
awarding points on a scale from 1 to 100 for three categories:
problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing
a[0] with b[0], a[1] with b[1], and a[2] with b[2].

        If a[i] > b[i], then Alice is awarded 1 point.
        If a[i] < b[i], then Bob is awarded 1 point.
        If a[i] = b[i], then neither person receives a point.
        Comparison points is the total points a person earned.

        Given a and b, determine their respective comparison points.

        Example

        a = [1, 2, 3]
        b = [3, 2, 1]
        For elements *0*, Bob is awarded a point because a[0] .
        For the equal elements a[1] and b[1], no points are earned.
        Finally, for elements 2, a[2] > b[2] so Alice receives a point.
        The return array is [1, 1] with Alice's score first and Bob's second.

 */

import java.io.*;
import java.util.*;

class Result1 {

    public static  List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);

        return result;
    }

}

class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result1.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




class Result2 {
    public static void plusMinus(List<Integer> arr) {
        int positive_count=0;
        int negative_count=0;
        int zero_count=0;

        for(int num:arr){
            if (num>0){
                positive_count++;
            } else if (num<0) {
                negative_count++;
            }else{
                zero_count++;
            }
        }
        int totalCount = arr.size();

        double positiveFraction = (double) positive_count / totalCount;
        double negativeFraction = (double) negative_count / totalCount;
        double zeroFraction = (double)zero_count / totalCount;

        System.out.printf("%.6f%n", positiveFraction);
        System.out.printf("%.6f%n", negativeFraction);
        System.out.printf("%.6f%n", zeroFraction);
    }

}
class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result2.plusMinus(arr);

        bufferedReader.close();
    }
}


class Result3 {

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}

class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result3.staircase(n);

        bufferedReader.close();
    }
}

