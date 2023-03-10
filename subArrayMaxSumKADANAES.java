import java.util.*;

public class subArrayMaxSumKADANAES {
    public static void kadanes(int num []){
        boolean bl = true;
        for(int i =0;i<num.length;i++){//checking for the any pos num in array
            if(num[i]>0){
                bl = false;
            }
        }
        if(bl){
            int ms = Integer.MIN_VALUE;
            for(int i =0;i<num.length;i++){
                ms = Math.max(ms,num[i]);
            }
            System.out.println("Max sum is = "+ms);
            return;
        }


        int CS=0;
        int MS=Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            CS += num[i];
            if (CS<0){
                CS =0;
            }
            MS = Math.max(CS,MS);

        }
        System.out.println("Max sum is = "+MS);
    }
    public static void main(String[] args) {
        int numbers []= {-2,-3,-4,-1,-2,-1,- 1,-3};
        kadanes(numbers);

    }
}
