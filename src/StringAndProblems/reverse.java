package StringAndProblems;

//Reversing the individual Strings and the elements using String Builder
import  java.util.*;
import java.util.Arrays;

class WordReverse {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String []word=s.split(" ");
        System.out.println(Arrays.toString(word));
        StringBuilder rev= new StringBuilder();
        for(int i=0;i< word.length;i++){
            String w=word[i];
            StringBuilder rw= new StringBuilder(" ");
            for(int j=w.length()-1;j>=0;j--){
                rw.append(w.charAt(j));
            }
            rev.append(rw);
        }
        System.out.println(rev);
    }
}


class ReversingWord{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();   //hello world
        String []word=s.split(" "); //[hello , world]
        StringBuilder rev=new StringBuilder();//rev=""
        for (int i = 0; i < word.length; i++) {
            String w=word[i];
            StringBuilder rw=new StringBuilder(" ");
            for(int j=w.length()-1;j>=0;j--){
                rw.append(w.charAt(j));
            }
            rev.append(rw);
        }
        System.out.println(rev);
    }
}


class ReversingWord2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();// java programming
        String []word=s.split(" ");
        //[java, programming]
        StringBuffer rev=new StringBuffer();//rev""
        for (int i = 0; i < word.length; i++) {
            String w=word[i];//programming
            StringBuilder rw=new StringBuilder(" ");//rw="avaj "
            for(int j=w.length()-1;j>=0;j--){  //gnimmagrgorp
                rw.append(w.charAt(j));
            }
            rev.append(rw);
        }
        System.out.println(rev.toString().trim());
    }

}














//Anagram or Not
class Anagram{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         String s1=in.nextLine(); //Signature
         String s2=in.nextLine();//A true sign
         s1=s1.replaceAll(" ","");
         s2=s2.replaceAll(" ","");

         s1=s1.toLowerCase();
         s2=s2.toLowerCase();

         if(s1.length()!=s2.length()){
             System.out.println("No");
         }else{
             char[] String1=s1.toCharArray();
             char[] String2=s2.toCharArray();
             BubbleSort(String1);
             BubbleSort(String2);
             String a=String1.toString();
             String b=String2.toString();
             if(a.equals(b)){
                 System.out.println("Yes");
             }
             else{
                 System.out.println("No");
             }
         }
    }
    static void BubbleSort(char[] arr){
        int len= arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}


//Array Concatenation and Sorting
class ArrayConcat{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        int []arr1=new int[n];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]= in.nextInt();
        }
        int []arr2=new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= in.nextInt();
        }
        
    }
}




















