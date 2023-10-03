import java.util.*;
public class Palindrom{
    public static boolean checkPalindrome(String name ){
        boolean bool = true;
        for(int i=0; i<=name.length()/2 ;i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                bool = false;
                return bool;
            }
        }
        return bool;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean bool = checkPalindrome(name);
        if(bool){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
