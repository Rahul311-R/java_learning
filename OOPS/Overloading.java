package OOPS;

class ai{
    int num;
    String name;
    ai(int n,String na){
        num = n;
        name = na;
    }
    ai(int n){
        num = n;
        name = "unknown";
    }
    ai(){
        num = 0 ;
        name = "not found";
    }
    void show(){
        System.out.println(num);
        System.out.println(name);
        System.out.println("------------");
    }
}

public class Overloading {
    public static void main(String[] args) {
        ai s1 = new ai(66, "rahul");
        ai s2 = new ai(75);
        ai s3 = new ai();

        s1.show();
        s2.show();
        s3.show();
    }
}
