import java.util.Scanner;

public class printSumEvenOdd {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number,count;
        int even=0,odd=0;
        do{
            System.out.print("Enter number : ");
            number=sc.nextInt();
            if(number%2==0){
                even +=number;
            }else{
                odd +=number;
            }
            System.out.print("press 1 for continue add and 2 for print the sum : ");
            count =sc.nextInt();
        }while(count==1);



        System.out.println("Sum of evem number is : "+ even);
        System.out.println("Sum of odd number is : "+ odd);
    }
}
