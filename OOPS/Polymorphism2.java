package OOPS;

class box{
    void put(){
        System.out.println("fruits and vegtables are in the box");
    }
}

class fruit extends box{
    void put(){
        System.out.println("box has fruits");
    }
}

class veg extends box{
    void put(){
        System.out.println("box has vegtables");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        box b;

        b = new fruit();
        b.put();
        b = new box();
        b.put();
        b = new veg();
        b.put();
    }
}
