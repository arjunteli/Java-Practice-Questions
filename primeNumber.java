import java.util.*;
public class primeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter numbers : ");
        int n = sc.nextInt();
        // if(n<2){
        //     System.out.println("COMPOSITE");
        // }else if(n==2){
        //     System.out.println("PRIME");
        // }else{
        //     for(int i=2;i<n;i++){
        //         if(n%i==0){
        //             System.out.println("COMPOSITE");
        //             return;
        //         }
        //         }
        //             System.out.println("PRIME");
        //     }



        if(n<2){
            System.out.println("Not a Prime");
        }else if(n==2){
            System.out.println("PRIME");
        }else{
            boolean isPrime= true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is Prime");
            }else{
                System.out.println("NOT PRIME");
            }
        }


        }

    }

