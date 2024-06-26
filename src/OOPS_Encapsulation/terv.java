package OOPS_Encapsulation;
class  AccessSpecifiers{
    private void method1(){

        System.out.println("Private method...");
    }
    void getMethod(){
        method1();
    }
    protected void method2(){

        System.out.println("Protected Method...");
    }

    void method3(){

        System.out.println("Default Method...");
    }

    public void method4(){
        System.out.println("Public Specifier...");
    }
}
public class terv extends AccessSpecifiers {
    public static void main(String[] args) {
        new AccessSpecifiers().getMethod();
        System.out.println("Encapsulation Package.....");
        System.out.println("It is the main method");
    }
}


