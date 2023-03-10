import java.util.*;
public class multiplicationtable {
    public static void table(int n){
        for(int i = 1;i<=10;i++){
            System.out.println(n+ " * "+i+" = "+  (n*i)  );
        }
        return;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        System.out.println("Table of "+ n + " is ");
        table(n);
    }
}
