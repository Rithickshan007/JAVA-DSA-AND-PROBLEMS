package Polymorphism;

class TervPro {
    void Salary() {
        System.out.println("Default Salary Package: 4.5LPA ");
    }
}
class Aadhi extends TervPro {
    void Salary() {
        super.Salary();
        System.out.println("Based on Performance 1 : Rs.18000");
    }
}

class Ashok extends TervPro {
    void Salary() {
        System.out.println("Based on Performance 2 : Rs.23000");
    }
}

class Rithick extends TervPro {
    void Salary() {
        System.out.println("Based on Performance 3 : Rs.10000");
    }
}

//Test class to create objects and call the methods
class MethodOverriding_Super_Keyword {
    public static void main(String[] args) {
        Aadhi s = new Aadhi();
        Ashok i = new Ashok();
        Rithick a = new Rithick();
        s.Salary();
        i.Salary();
        a.Salary();
    }
}
