import java.util.*;
public class primesInRange {

    public static boolean isPrime(int n){
        boolean ans = true;
        if(n==2){
            return ans;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){//for optimised method i=2 to i<=Math.sqrt(n);;;;;;;;
            if(n%i==0){
                ans = false;
                return ans;
            }
        }
        return ans;
    }

    public static void printPrime(int n){
       for(int i=2;i<=n;i++){
        if(isPrime(i)){//helper function
            System.out.print(i+ " ");
        }
       }return;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Range = ");
        int n = sc.nextInt();//take input as range from user
       printPrime(n);
      
    }
}
