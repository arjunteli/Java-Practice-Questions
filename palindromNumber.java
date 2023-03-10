import java.util.*;
public class palindromNumber {
    public static boolean isPalindrom(int num){
        int temp = num;
        int newNum=0;
        while(num>0){
            int rem = num % 10;
            newNum = 10*newNum + rem; 

            num /= 10;
        }

        if(temp==newNum){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        if(isPalindrom(num)){
            System.out.println("Palindrome");

        }else{ 
            System.out.println("Not a Palindrome");

        }
              
    }
}
