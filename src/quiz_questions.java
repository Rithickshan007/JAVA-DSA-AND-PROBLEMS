import java.util.Scanner;

class Quiz1{
    public static void main(String[] quiz) {
        System.out.println("Welcome to Java Quiz");
    }
}

class Quiz2{
    public static void main(String[] args) {
        int num=36;
        num%=6;
        System.out.println(num);
    }
}


class  Quiz3{
    public static void main(String[] args) {
        byte[] arr ={48,49,50,51,52,53};
        String str=new String(arr);

        System.out.println(str);
    }
}

class Quiz4{
    public static void main(String[] args) {
        double num1=0.1;
        double num2=0.2;
        double sum =num1+num2;

        if(sum==0.3){
            System.out.println("EQUAL");
        }else{
            System.out.println("NOT EQUAL");
        }
    }
}

class Quiz5{
    public static void main(String[] args) {
        int i=0;
        i = (i += 1) - --i + ++i - --i;
        System.out.println(i);

    }
}

class  Quiz6{
    public static void main(String[] args) {
        int qNo=6;
        String event="Java Quiz";

        System.out.printf("Event : %s , QNo: %d",event,qNo);
    }
}

class Quiz7{
    public static void main(String[] args) {
        for(;;){
            System.out.println("Java Quiz");
        }
    }
}

class  Quiz8{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = num1++;

        System.out.println(num2++);
    }
}
class  fibonacci
{
    public static void main (String[]args)
    {

        Scanner in= new Scanner(System.in);
        int nums=in.nextInt();
        int num1 = 0, num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        int nextNum;

        for (int i = 2; i < nums; i++)
        {
            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
            System.out.println (nextNum);
        }
    }
}

class fibonacci2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i < num; i += 2) {
            a = a + b;
            b = a + b;
            System.out.println(a);
            System.out.println(b);
        }
        if (num % 2 != 0) {
            a = a + b;
            System.out.print(a);
        }
    }
}
