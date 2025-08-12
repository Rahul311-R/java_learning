package OOPS;

class animal{
    void eat(){
        System.out.println("The animal is lion");
    }
}
class forest extends animal{
    void time(){
        System.out.println("eat any time");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        forest f = new forest();
        f.time();
        f.eat();
    }
}
