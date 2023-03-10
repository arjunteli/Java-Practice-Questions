public class Interface {
    public static void main(String args []) {
        Bear bhalu = new Bear();
        bhalu.eat();
    }
}
interface Herbivore {
    void eat();//public, static , abstract 
}
interface Carnivore {
    void eat();//public, static , abstract 
}
class Bear implements Herbivore , Carnivore {
    public void eat() {
        System.out.println("eats grass and meat");
    }
}