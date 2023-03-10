import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //input numbers
         System.out.print("Please enter a : ");
         int a = sc.nextInt();
         System.out.print("Please enter b : ");
         int b = sc.nextInt();
         System.out.println(" ");

         //calculator Guide
         System.out.println("Please Enter 1 for Addition \nPlease Enter 2 for Subtraction\nPlease Enter 3 for Multiplication\nPlease Enter 4 for Division\nPlease Enter 5 for Modulo");
          
         //CalcuLator
         int num = sc.nextInt();
         switch(num){
            case 1 : System.out.println("Addition of numbers is : " + (a+b));
                    break;
            case 2 :System.out.println("Subtraction of numbers is : "+ (a-b));
                    break;
            case 3 : System.out.println("Multiplication of numbers is : " + (a*b));
                    break;
            case 4 :if (b==0){
                System.out.println("INVALID!!!!");
            }else{
                        System.out.println("Division of numbers is : " + (a/b));
                    }        break;
            case 5 :System.out.println("Modulo of numbers is : " + (a%b));
                    break;
            default :System.out.println("WRONG KEY ENTERED ");        

         }

        }
}
