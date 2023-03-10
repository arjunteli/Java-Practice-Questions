import java.util.*;
public class switchCase{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //input number
        int num = sc.nextInt();


        //switch KEY
        switch(num){
            case 1  : System.out.println("1 is Entered");
                    break;
            case 20 : System.out.println("2 is Entered");
                    break;
            case 3 : System.out.println("3 is Entered");break;
            default : System.out.println("WRONG");
        }
    }
}
