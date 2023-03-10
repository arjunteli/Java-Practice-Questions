import java.util.*;
public class passOrFail {
    public static void main(String[]args){

       Scanner sc = new Scanner(System.in);

       //input marks
       int marks = sc.nextInt();

       //check pas-1s or fail
    //    if(marks>=33){
    //     System.out.println("PASS");
    //    }else{
    //     System.out.println("FAIL");
    //    }

       //Ternary Operator   
       String result = (marks>=33)?"PASS":"FAIL";
       System.out.println(result);


    }
}
