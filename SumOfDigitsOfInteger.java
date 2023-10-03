import java.util.*;
public class SumOfDigitsOfInteger{
    public static int sum(int n ){
        int sum=0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number = ");
        int n = sc.nextInt();
        System.out.println("Sum of the numbers of the integer is " + sum(n));
    }
}
