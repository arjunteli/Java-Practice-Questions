public class bubbleSort {
    public static void bubbleSorts(int nums[]){
        int n = nums.length;int swap=0;
        for(int i = 0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swap++;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println(swap);
    }
    public static void main(String args[] ){
        int nums[]= {5,4,3,2,1};
        bubbleSorts( nums);

    }    
}
