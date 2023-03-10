public class linearSearch {
    public static int searchKey(int array[],int key){
        for(int i=0 ;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
            }
            return (-1);
        }

    
    public static void main(String args[]){
        int key =16;
        int array[]= {2,4,6,8,10,12,14,16};
        if(searchKey(array,key)>=0){
            System.out.println(searchKey(array,key));
        }
        else{
            System.out.println("No key is present ");
        }

    }
}
