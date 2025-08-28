interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() { // must be public
        System.out.println("Bark");
    }
}

class Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}