package Method;

class Methods{
    public static void main(String[] args) {
        add(3,5);
        int s=sub();
        System.out.println(s);
        int m=mul(6,5);
        System.out.println(m);
        divide(); 
    }
    static void add(int a, int b){  //without return type with arg
        System.out.println(a+b);
    }
    static int sub(){//with return type without arg
        return 10-9;
    }
    static int mul(int a,int b){//with return type with arg
        return a*b;
    }
    static void divide(){//without return type without arg
        final int a=10;
        final int b=20;
        System.out.println(a/b);
    }
}