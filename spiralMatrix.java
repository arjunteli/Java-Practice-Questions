public class spiralMatrix{
    public static void printSpiral(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;
        
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                
                System.out.print(matrix[startRow][j] + " ");
            }
            
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){//top part should not be printed secondtime
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i= endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){//right part should not be printed 2nd time
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String args[]){
        int matrix[][] =   {{1,2,3},
                            {5,6,7},
                            {9,10,11},
                            {13,14,15},
                            {21,22,23}};
        int mat[][] = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12}};
        int mat2[][] = {
                          {1,2,3}};
        int mat3[][] = {{1},
                        {2},
                        {3}};              

        printSpiral(matrix);                   
    } 
    
}
