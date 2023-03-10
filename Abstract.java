public class Abstract {
    public static void main(String args []) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    } 
}
abstract class Animal {
    Animal() {
        System.out.println("CONSTRUCTOR CALLED");
    }
    void eat() {
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    void walk () {
        System.out.println("walk on 4 legs");
    }
}

