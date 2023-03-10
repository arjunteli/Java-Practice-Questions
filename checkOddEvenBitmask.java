import java.util.*;
public class checkOddEvenBitmask {
    public static void main(String args []) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            int bitMask = 1;
            if((n & bitMask)==1){
                System.out.println( n + " is odd number " );
            }else {
                System.out.println(n+ " is even number 3");
            }

    }
}