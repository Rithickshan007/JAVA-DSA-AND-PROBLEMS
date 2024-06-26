package Inheritance;

class Father {
    void printline(){
        System.out.println("Father");
    }
}

class Mother1 extends Father {
    void printline1(){
        System.out.println("Mother 1");
    }
}

class Child1 extends Mother1 {
    void printline2(){
        System.out.println("Child of wife 1");
    }
}

class Mother2 extends Father {
    void printline3(){
        System.out.println("Mother 2");
    }
}

class Child2 extends Mother2 {
    void printline4(){
        System.out.println("Child 1 of 2nd parent");
    }
}

public class hybrid {
    public static void main(String[] args) {
        // Create objects of classes
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        // Call methods

        child1.printline1(); // This will print "Mother 1"
        child1.printline2(); // This will print "Child of wife 1"

        child2.printline3(); // This will print "Mother 2"
        child2.printline4(); // This will print "Child 1 of 2nd parent"
    }
}
