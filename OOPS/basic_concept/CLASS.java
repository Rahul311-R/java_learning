package OOPS;

class sun{
    int num;
    String dept;
    void show(){
        System.out.println("reg no:"+num);
        System.out.println("dept:"+dept);
    }
}

public class CLASS {
    public static void main(String[] args) {
        sun me = new sun();
        me.dept = "AI";
        me.num = 66;
        me.show();
    }
}
