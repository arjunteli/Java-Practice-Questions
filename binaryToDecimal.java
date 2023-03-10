import java.util.*;
public class binaryToDecimal {
    public static void binaryToDecimal(int bin){
        int dec=0,pow=0;
        while(bin>0){
            int LD = bin%10;
            dec = dec +(LD *(int)Math.pow(2,pow));
            pow++;
            bin /=10;

        }
        System.out.println(  "Decimal Number = " +dec);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary Number = ");
        int bin = sc.nextInt();
        binaryToDecimal(bin);
        

    }
}
