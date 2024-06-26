package Polymorphism;

class Employee {
    int id;
    String name;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Employee{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){System.out.println(id+"  "+name+"  Rs."+salary);}
}
class TestSuper5{
    public static void main(String[] args){
        Emp e1=new Emp(1,  "Ashok",  45000f);
        e1.display();

        Emp e2=new Emp(2,"Aadhiseshan",40000f);
        e2.display();
    }}