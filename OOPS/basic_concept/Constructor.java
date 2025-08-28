package OOPS;

class rahul{
    int num;
    String name;
    rahul(int n,String a){//construtor should have same name
        name = a;
        num = n;
    }
    void show(){
        System.out.println("num:"+num);
        System.out.println("name:"+name);
    }

}

public class Constructor {

    public static void main(String[] args) {
        rahul s1 = new rahul(66,"rahul");
        rahul s2 = new rahul(75,"sanjay");

        s1.show();
        s2.show();
    }
}
