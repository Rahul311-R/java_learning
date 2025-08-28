//package OOPS;
//
////Distinguishing instance variables from parameters
//class Student1 {
//    int id;
//    String name;
//
//    Student1(int id, String name) {
//        this.id = id;      // 'this.id' = instance variable
//        this.name = name;  // 'name' = parameter
//    }
//}
//
////Calling another constructor in the same class (Constructor chaining)
//class Student {
//    int id;
//    String name;
//
//    Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    Student(int id) {
//        this(id, "Unknown"); // calls the first constructor
//    }
//
//    Student() {
//        this(0, "Not Found"); // calls the first constructor
//    }
//}
//
//// Passing the current object as a parameter
//class A {
//    void display() {
//        System.out.println("Hello from display!");
//    }
//    void show(A obj) {
//        obj.display();
//    }
//    void start() {
//        show(this); // passing current object
//    }
//}
//
//// Returning the current object
//class b {
//    A getObj() {
//        return this; // returning same object
//    }
//}
