class Parameterized_Constructor {
    int id;
    String name;
    int rollNo;
    float average;
    Parameterized_Constructor(String name, float average) {
        this.name = name;
        this.average = average;
    }

    Parameterized_Constructor(int id, int rollNo) {
        this.id = id;
        this.rollNo = rollNo;
    }



    void print() {
        if (id != 0 && rollNo != 0) {
            System.out.println(id + " " + rollNo);
        }
        if (name != null && average != 0.0f) {
            System.out.println(name + " " + average);
        }
    }

    public static void main(String[] args) {
        Parameterized_Constructor s2 = new Parameterized_Constructor(100, 167);
        Parameterized_Constructor s1 = new Parameterized_Constructor("Rithickshan", 87.5f);
        s1.print();
        s2.print();

    }
}

class  Copy_Constructor{
    int id;
    String name;
    Copy_Constructor(int id, String name){
        this.id=id;
        this.name=name;
    }
    Copy_Constructor(Copy_Constructor_2 cc){
        id=cc.id;
        name=cc.name;
    }
    void print(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Copy_Constructor_2 cc1=new Copy_Constructor_2(100,"Rithick");
        Copy_Constructor_2 cc2= new Copy_Constructor_2(10,"Raj");
        cc1.print();
        cc2.print();
    }
}

class Copy_Constructor_2 {
    int id;
    String name;
    Copy_Constructor_2(int id, String name){
        this.id=id;
        this.name=name;
    }
    Copy_Constructor_2()
    {
    }
    void print(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Copy_Constructor_2 c1=new Copy_Constructor_2(100,"Rithick");
        Copy_Constructor_2 c2= new Copy_Constructor_2();
        c2.id=c1.id;
        c2.name=c1.name;
        c1.print();
        c2.print();
    }
}