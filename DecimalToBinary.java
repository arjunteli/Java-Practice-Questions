import java.util.*;
public class DecimalToBinary {
    public static void decToBinary(int dec){
        int pow =0, bin=0; 

        while(dec>0){
            int rem = dec%2;
            bin = bin + (int)(rem*Math.pow(10,pow));
            dec/=2;
            pow++;
        }
        
        System.out.println(bin);
        return;
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Decimal Number = ");
        int dec = sc.nextInt();
        decToBinary(dec);

    }
}
