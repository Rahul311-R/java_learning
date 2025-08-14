package OOPS;

class shape{
    void area(int r){
        int n = 22/7 * r * r ;
        System.out.println(n);
    }
    void area(int b,int h){
        int n = b * h ;
        System.out.println(n);
    }
}

class Polymorphism {
    public static void main(String[] args) {
        shape s = new shape();
        s.area(4);
        s.area(5);
        s.area(4,7);
    }
}
