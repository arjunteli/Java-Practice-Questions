import java.util.*;
public class binomialCoefficient{
    public static int calcFactorial(int n ){
        int fact = 1;
        for(int i =n;i>=1;i--){
            fact *=i;
        }
        return fact;
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int coeff = (calcFactorial(n))/(calcFactorial(r)*calcFactorial(n-r));
        System.out.println("Binomial Coefficient = "+ coeff);
    }
}