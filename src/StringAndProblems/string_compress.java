package StringAndProblems;

import java.util.Scanner;

class StringCompression {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        StringBuffer sb = new StringBuffer();

        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println(sb);
    }
}






class StringCompressProb{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();     //aaabbbbcc   //len=9
        StringBuffer sb=new StringBuffer();
        int count=1;
        for (int i = 1; i <=s.length() ; i++) {//i=4
            if(i==s.length()||s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i-1));
                sb.append(count);
                count=1;
            }else{
                count++; //count=3
            }
        }
        System.out.println(sb);  //a3
    }
}





















