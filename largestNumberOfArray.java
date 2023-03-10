public class largestNumberOfArray {
    public static void largestNum(int[] array ){

        int larg = array[0];
        for(int i=1;i<array.length;i++){
            if(larg<array[i]){
                larg = array[i]; 
            }
            
        }
        System.out.println("Largest number in array is : "+larg);
    }
    public static void main(String args[]){
        int array[] = {1,2,6,8,5};
         largestNum(array);

    }
}