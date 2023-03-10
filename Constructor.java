public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("blue");
        System.out.println(s1.name);

    }
}
class Student {
    String name ;
    String roll;
    String color;
    Student (String name) {
        this.name = name;
    }
    Student (String color) {
        this.color = color;
    }
}
