package OOPS;

class college{
    void dept(){
        System.out.println("ai&ds and CSE");
    }
}

class aids extends college{
    void section(){
        System.out.println("2 section");
    }
}

class cse extends college{
    void section(){
        System.out.println("3 section");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        aids a = new aids();
        a.dept();
        a.section();
        System.out.println("---------------");
        cse b = new cse();
        b.dept();
        b.section();
    }
}
