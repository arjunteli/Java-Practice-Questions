import java.util.Scanner;

public class AdvancedPatternproblems {
    public static void hollowRectangle(int m, int n){
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    public static void InvertedHalfPyramid(){
        for(int i=1;i<=4;i++){
            for(int j= 4;j>i;j--){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // hollowRectangle(m, n);



        // InvertedHalfPyramid();





    }
}
