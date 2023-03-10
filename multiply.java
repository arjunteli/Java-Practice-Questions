import java.util.*;
public class multiply {
    public static int multiplY(int a,int b){
        int product =a*b;
        return product;
    }



    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int pro = multiplY(a,b);
        System.out.println( "Product of a and b is : " +pro);
    }
}
