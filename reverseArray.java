public class reverseArray {
    public static void reverse(int numbers[]){

        int start = 0;
        int end =numbers.length-1; 

        while(start<end){//if equal NO CHANGED
            int temp = numbers[start];
            numbers [start] = numbers[end];
            numbers [end ]= temp ;
            start++;
            end--;

        }
        //return numbers;
          return;
    }
    public static void main(String args []) {
         int numbers[] = {2,4,6,8,10,12,14};
         System.out.println("AA");
            reverse(numbers);
    
         for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+ " ");
         }
    }    
}
