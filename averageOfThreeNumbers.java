import java.util.Scanner;

public class averageOfThreeNumbers {
    public static float avgNum(int a,int b,int c){
        float avg = (a+b+c)/3f;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of a,b,c = "+avgNum(a,b,c));
    }
}
