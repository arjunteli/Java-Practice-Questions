public class homeWork2DArray {
    public static void counting(int arr[][],int num){
        int count =0 ;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(num==arr[i][j]){
                    count++;
                }
            }
        }
       System.out.println("total times of "+ num + " in array is : "+ count);
       
    }
    public static void sum(int arr[][],int row){
        int sum =0;
        for(int j= 0;j<arr[0].length;j++){
            sum += arr[row-1][j];
        }
        System.out.println("sum of 2nd row is : "+ sum );
    }
    public static void main(String args[]){

        // int arr [][] = { {4,7,8},
        //                  {8,8,7} }; 
        // int num = 18; 
        // counting(arr, num);    
        
        int row = 2; //2 means 2nd row
        int arr[][] = { {1,4,9},
                        {11,4,3},
                        {2,2,3} };
                    printMatrix(arr);
        sum(arr, row);
    }

}
