public class Super {
    public static void main(String args []) {
        Horse h = new Horse();
    }
}
class Animal {
    Animal() {
         System.out.println("Animal class constructor is called ");
    }
}
class Horse extends Animal {
     Horse() {
        System.out.println("Horse class constructor is called");
     }
}