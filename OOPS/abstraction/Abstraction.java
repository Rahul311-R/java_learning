package OOPS;

abstract class state{
    void city(){
        System.out.println("coimbatore");
    }
    abstract void house();
}

class home extends state{
    void house(){
        System.out.println("161");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        state a = new home();
        a.city();
        a.house();
    }
}
