package ClassAndObjects;


//Simple Declaration of Classes and Objects

class Box{
    double width;
    double height;
    double depth;
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box();
        double vol;
        myBox1.height=10;
        myBox1.depth=20;
        myBox1.width=30;

        myBox2.height=15;
        myBox2.depth=10;
        myBox2.width=8;

        //Calculating the volume of the Box

        vol= myBox1.width* myBox1.depth* myBox1.height;
        System.out.println(vol);

        vol= myBox2.depth* myBox2.width* myBox2.height;
        System.out.println(vol);


    }
}