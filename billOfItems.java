import java.util.Scanner;

public class billOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //input cost of items
        System.out.print("Please Enter the Cost of Pencil : ");
        int a = sc.nextInt();
        System.out.print("Please Enter the Cost of Pen : "); 
        int pn= sc.nextInt();
        System.out.print("Please Enter the Cost of Eraser : ");
        int e = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");

        //print bill
        System.out.println("Pencil price is : "+ a);
        System.out.println("Pen price is : "+pn);
        System.out.println("Eraser price is : "+e);

        //sum of cost
        int sum= a+pn+e;

        //GST
        float GST= 0.18f * sum;
        System.out.println("GST of the Bill is : "+ GST);

        //total amount
        System.out.println("Total Amount is : " + (sum+ GST));

    }
}
