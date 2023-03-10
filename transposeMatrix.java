import java.util.*;
public class transposeMatrix{
    public static void printMatrix(int matrix [][]){
        System.out.println("Matrix is : ");
        for(int i= 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        //input no of rows
        System.out.print("Enter no of rows : ");
        int row = sc.nextInt();

        //input no of columns
        System.out.print("Enter number of colums : ");
        int col = sc.nextInt();

        //input elements of matrix
        int matrix [][] = new int[row][col];
        System.out.println("Enter the element of array ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("("+i+","+j+") = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        //Print Real Matrix
        printMatrix(matrix);

        //transpose of matrix 
        int transpose[][] = new int[col][row];
        for(int i =0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                transpose[i][j] = matrix [j][i];
            }
        }

        //print transpose
        printMatrix(transpose);



    }
}