public class searchInSortedArray2D{

    public static void search(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1 ;

        while(row < arr.length && col >=0){
            if(key == arr[row][col]){
                System.out.println("Key is found at ("+ row +","+ col + ")");
                return;
            }
            else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found in this array ");

    }
    public static void search2(int arr[][],int key){
        int row = arr.length-1;int col = 0;
        while(row >= 0 && col<arr[0].length){
            if(key == arr[row][col]){
                System.out.println("Key is found at ("+ row +","+ col + ")");
                return;
            }
            else if(key>arr[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Key not found in this array ");
    }


    public static void main(String args []){
        int arr[][]= {  {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 40;
        search2(arr,key);
                        
    }
}