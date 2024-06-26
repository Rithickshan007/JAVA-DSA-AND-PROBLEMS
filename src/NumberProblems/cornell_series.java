package NumberProblems;

import java.util.Scanner;

//Time complexity O(N^2)

class CornelSeries1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int start = 1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(start+ " ");
                start += 2;
            }
            start--;
            System.out.println();
        }


    }
}

//Time Complexity O(N)
class CornelSeries2{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int start=1;
        while((N--)>0){
            System.out.print(start + " ");
            if(((int)Math.sqrt(start)*(int)Math.sqrt(start))==start) {
                start--;
            }
            start+=2;
        }
    }
}


