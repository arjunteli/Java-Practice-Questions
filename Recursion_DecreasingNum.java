import java.util.*;

public class Recursion_DecreasingNum {
    public static void printNums(int n) {
        if(n==0) {
            
            return;
        }
        System.out.println(n);
        printNums(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        printNums(n);
    }
}
