import java.util.Scanner;

public class primeNumberFunc {
    public static boolean isPrime(int n){
        boolean ans = true;
        if(n==2){
            return ans;
        }
        for(int i = 2;i<n;i++){//for optimised method i=2 to i<=Math.sqrt(n);;;;;;;;
            if(n%i==0){
                ans = false;
                return ans;
            }
        }
        return ans;
    }




    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //input
        System.out.print("Enter number = ");
        int n= sc.nextInt();
        if(n<2){
            System.out.println("NOT prime");
        }else{
            boolean ans = isPrime(n);
            if(ans==true){
                System.out.println("PRIME");
            }else{
                System.out.println("NOT prime");
            }
        }

    }
}
