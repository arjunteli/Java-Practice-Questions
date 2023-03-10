import java.util.*;
public class printSubArray {
    public static void subArray(int array[]){

        for(int i=0;i<array.length;i++){
            int start = i;
            for(int j = i;j<array.length;j++){
                int end = j;
                int sum =0;
                int max =Integer.MIN_VALUE;
                int min =Integer.MAX_VALUE;
                for ( int k=start;k<=end;k++){//print
                    
                    System.out.print(array[k] +" ");
                    sum += array[k];
                    if(min>array[k]){
                        min = array[k];
                    }
                    if(max<array[k]){
                        max = array[k];
                    }
                }
                System.out.print("  || sum is = "+sum+ " || min is = "+ min + " || max is = "+ max);
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int array [] = {2,4,6,8,10,11,12,13,14,15};
        subArray(array);
    }
}
