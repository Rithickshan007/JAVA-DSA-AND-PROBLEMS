class Aadhi {
    public void type() {
        System.out.println("Home");
    }
}
class Rithick extends Aadhi {
    public void type() {
        System.out.println("Traveller");
    }
}
class Ashok extends Aadhi {
    public void type() {
        System.out.println("Thanioruvan");
    }
}
class AdhiMain {
    public static void main(String[] args) {
        Aadhi obj = new Aadhi();
        obj.type();

        obj = new Rithick();
        obj.type();

        obj = new Ashok();
        obj.type();
    }
}
