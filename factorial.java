import java.util.*;
public class factorial {

    public static int calcFactorial(int n ){
        int fact = 1;
        for(int i =n;i>=1;i--){
            fact *=i;
        }
        return fact;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();//user input
        if(n<0){
            System.out.println("INVALID!!!");
        }else{
            System.out.println( "Factorial of "+ n +" is = "+ calcFactorial(n));
        }

    }
}
