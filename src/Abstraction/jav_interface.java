package Abstraction;

interface Father{
    void Tamil();
}

interface Mother{
    void English();

}

class Native_lang implements Father,Mother{

    public void Tamil() {
        System.out.println("Speaking Tamil- Father");
    }

    public void English() {
        System.out.println("Speaking English- Mother");
    }
}
class Native{
    public static void main(String[] args) {
        Father obj1=new Native_lang();
        obj1.Tamil();
        Mother obj2=new Native_lang();
        obj2.English();
    }
}