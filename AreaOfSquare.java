import java.util.Scanner;

public class AreaOfSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input side 
        float s = sc.nextFloat();
        //area
        float area= (s*s);
        System.out.println(area);
    }
}
