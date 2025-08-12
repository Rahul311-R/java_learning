package OOPS;

class vsb{
    void college(){
        System.out.println("name of the college");
    }
}

class ai_ds extends vsb{
    void dept() {
        System.out.println("ai&ds has 2 section");
    }
}

class section extends ai_ds{
    void sec(){
        System.out.println("B section has 50 students");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        section s = new section();
        s.sec();
        s.dept();
        s.college();
    }
}
