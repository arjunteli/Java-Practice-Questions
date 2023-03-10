import java.util.Scanner;

public class checkNumberIsPositiveORNegative {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        //input number from User
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        String result = (num>=0)?"POSITIVE":"NEGATIVE";
        System.out.println(result);


    }
}
