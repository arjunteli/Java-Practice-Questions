public class Inheritance {
    public static void main(String args [] ) {
        Fish shark = new Fish();
        shark.eat();
    }
}
class Animals {
    String color;
    void eat () {
        System.out.println( " eats");
    }
    void breath() {
        System.out.println("breaths");
    }
}
class Fish extends Animals {
    int fins ;
    void swim(){
        System.out.println("swim");
    }
}