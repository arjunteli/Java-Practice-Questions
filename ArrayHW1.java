public class ArrayHW1 {
    public static boolean checkDuplicate(int num []){
        boolean bl = true ;
        for(int i = 0; i< num.length-1;i++){
            for(int j = i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return false;
                }
            }
        }
        return bl;
    }
    public static void main(String[] args) {
        int num [] = {1,1,1,3,3,4,3,2,4,4,2};
        System.out.println(checkDuplicate(num));

    }
}
