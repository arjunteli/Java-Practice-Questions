public public class new {
    public static void countingSort1(int nums[]){
        System.out.println("ARJUN");
        int largest = Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
             largest=Math.max(largest,nums[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(count[i]>0){
                nums[j]=count[i];
                j++;
                count--;
            }
        }

    }
    public static void main(String args []){
        int nums[]= {1,4,1,3,2,4,3,7};
       
        countingSort1(nums);
        

    }
}
 