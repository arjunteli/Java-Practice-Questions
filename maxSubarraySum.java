import java.util.*;
public class maxSubarraySum {
    public static void printMaxSubarray(int num[]){
         
        int max = Integer.MIN_VALUE;


        for(int i = 0;i<num.length;i++){
           
            for(int j =i;j<num.length;j++){
                int sum = 0;

                for(int k = i;k<=j;k++){
                    sum += num[k];
                }

                System.out.println("sum is = "+ sum);
                if(max<sum){
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum is = "+ max);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,-8};
        printMaxSubarray(numbers);

    }
}
