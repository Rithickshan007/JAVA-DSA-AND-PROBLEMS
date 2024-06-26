package ZOHO;
import  java.util.*;
class WaterProblem{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;a[i++]= in.nextInt());
        Arrays.sort(a);
        int sec_max=a[n-2];
        int res=0;
        for(int i=0; i<n-1;i++){
            res=res+(sec_max-a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(res);
    }
}


class  WaterProb{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;a[i++]= in.nextInt());
        Arrays.sort(a);
        int sec_max=a[n-2];
        int res=0;
        for(int i=0;i<n-1;i++){
            res=res+(sec_max-a[i]);
        }
        System.out.println(res);

    }
}


class CruiseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n];
        int[] l = new int[n];
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            e[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int person=0;
        for(int i=0;i<n;i++)
        {
            person=person+e[i];
            person=person-l[i];
            p[i]=person;
        }
        for(int i=0; i<p.length; i++) {
            System.out.print(p[i]+" ");
        }
        System.out.println();
        int index=0;
        int max=0;
        for(int i=1;i<p.length;i++)
        {
            if(max<p[i])
            {
                max=p[i];
                index=i;
            }
        }
        System.out.println("Maximum Members at an Hour: "+p[index]);
        System.out.println(index+1);
    }
}
