import java.util.Scanner;

public class chechEven {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number = ");
        int a = sc.nextInt();
        boolean check =isEven(a);
        System.out.println(check);

    }
}
