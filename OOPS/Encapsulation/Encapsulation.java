package OOPS;

class person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        if(a>0){
            this.age = a;
        }else{
            System.out.println("age must be positive");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        person p = new person();
        p.setName("rahul");
        p.setAge(21);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
