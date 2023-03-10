public class functionOverloading {
    //function to calc sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }
    //function to calc sum of 3 numbers
    public static int sum(int a,int b,int c){
        return a+b+c;
    }



    //function to add 2 int values
    public static int sum1(int a,int b){
        return a+b;
    }
    //funtion to add 2 float values
    public static float sum1(float a,float b){
        return a+b;
    }








    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));


        System.out.println(sum1(3,5));
        System.out.println(sum1(4.3f,5.3f));
    }
}
