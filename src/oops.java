class OOPS_Class{
    public static void main(String[] args) {
       //Syntax: ClassName Object= new Constructor_function;
        Terv employees = new Terv();

        Terv rithick;
        rithick=new Terv();
        rithick.empId=256;
        rithick.empName="Rithickshan";
        rithick.score=56.52f;
        System.out.println(rithick.empId);
        System.out.println(rithick.empName);
        System.out.println(rithick.score);
    }
}
class Terv{
    int empId;
    String empName;
    float score;
}