public class insertionSort {
    public static void insertionSorting(int nums[]){
        int n = nums.length;
        for(int i=1;i<=n-1;i++){
            int curr = nums[i];
            int prev = i-1; 
            while(prev>=0 && nums[prev]>curr){
                nums[prev + 1]=nums[prev];//prev k aage sabko shift kr rhe h
                prev--;
            }
            nums[prev+1]=curr;//got the position
        }
    }
    public static void main(String args [] ){
        int nums [] = {5,4,1,3,2,4,7,2,9};
        insertionSorting(nums);
        for(int i =0; i<nums.length;i++){
            System.out.print(nums[i]+ " " );
        }
    }    
}
