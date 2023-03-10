import java.util.*;
public class largestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a>=b && a>=c){
        System.out.println(a +" is largest of three numbers");
      }else if(b>=a && b>=c){
        System.out.println(b+" is largest of three");
      }else{
        System.out.println(c+" is largest of three numbers");
      }
    }
}
