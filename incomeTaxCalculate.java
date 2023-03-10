import java.util.Scanner;
public class incomeTaxCalculate {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //input income
        int income = sc.nextInt(); 

        // tax calc
        if(income<500000){
            float tax = 0.0f*income;
            System.out.println("TAX : "+ tax);
        }else if (income>=500000&&income<1000000) {
            float tax = 0.2f*income;
            System.out.println("TAX : "+ tax);
        }else{
            float tax = 0.3f*income;
            System.out.println("TAX : "+ tax);
        }
    }
}
