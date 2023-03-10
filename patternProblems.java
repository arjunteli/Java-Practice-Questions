public class patternProblems {
    public static void star(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }return;
    } 


    public static void invertedStar(){
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }return;
    }
    

    public static void halfPyramid(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }return;
    }


    public static void printChar(){
        char ch ='A';
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }return;
    }


    public static void main(String[]args){
    //   star();
    //   invertedStar();
    //   halfPyramid();
    //   printChar();

    }
}
