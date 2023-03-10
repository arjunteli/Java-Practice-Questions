import java.util.*;
public class countingSort {
    public static void countingSort1(int nums[]){
        int largest = Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
             largest=Math.max(largest,nums[i]);
        }

        int count[]=new int[largest+1];//0 is also included as 0 is positive number
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;//calculating frequency
        }
        
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                nums[j]=i;//sorting our array here
                j++;
                count[i]--;
            }
          
        }

    }
    public static void main(String args []){
        int nums[]= {5,3,4,2,1,0,7,8,9 };
       
        countingSort1(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        

    }
}
