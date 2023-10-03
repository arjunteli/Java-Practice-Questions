import java.util.*;
public class SubarrayPrefixSum {
    public static void prefixSum(int num[] ){
        int preArr [] = new int[num.length];//declare prefix array
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<num.length;i++){//store values of prefix arrray
            sum +=num[i];//
            preArr[i]=sum;    
           
        }
        for (int i = 0;i<preArr.length;i++){//start 
            int currSum = 0;

            for(int j = i;j<preArr.length;j++){//end
                 currSum = i==0? preArr[j]: preArr[j]- preArr[i-1];
                 System.out.println("CURRENT SUM = "+ currSum);
            }
            if(max<currSum){
                max = currSum;
            }

        }
        System.out.println("MAX SUM is = "+ max );

    }
    public static void main(String args []){
        int numbers [] = {1,-2,6,-1,3};
        prefixSum(numbers);

    }
}
