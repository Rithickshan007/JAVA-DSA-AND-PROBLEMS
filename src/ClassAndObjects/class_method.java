package ClassAndObjects;

class Box2{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Volume is:"+" ");
        System.out.println(width*height*depth);
    }
}

class Box2Demo{
    public static void main(String[] args) {
        Box2 myBox1=new Box2();
        Box2 myBox2=new Box2();

        myBox1.height=10;
        myBox1.depth=20;
        myBox1.width=30;

        myBox2.height=15;
        myBox2.depth=10;
        myBox2.width=8;

        myBox1.volume();
        myBox2.volume();
    }
}


//Using return statements in methods
class Box3 {
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }
}

class Box3Demo{
    public static void main(String[] args) {
        Box3 myBox1=new Box3();
        Box3 myBox2=new Box3();
        double vol;

        myBox1.height=10;
        myBox1.depth=20;
        myBox1.width=30;

        myBox2.height=15;
        myBox2.depth=10;
        myBox2.width=8;

        vol=myBox1.volume();
        System.out.println(vol);
        vol=myBox2.volume();
        System.out.println(vol);
    }
}

//Calculating the Dimensions of the Box

class Box4{
    double width;
    double height;
    double depth;

    double volume(){
        return (width*height*depth);
    }
    void setDim(int h, int w, int d){
        width=w;
        height=h;
        depth=d;
    }
}

class Box4Demo{
    public static void main(String[] args) {
        Box4 myBox1=new Box4();
        Box4 myBox2=new Box4();
        double vol;

        myBox1.height=10;
        myBox1.depth=20;
        myBox1.width=30;

        myBox2.height=15;
        myBox2.depth=10;
        myBox2.width=8;

        myBox1.setDim(10,20,15);
        myBox2.setDim(25,32,40);

        vol=myBox1.volume();
        System.out.println(vol);
        vol=myBox2.volume();
        System.out.println(vol);
    }
}
