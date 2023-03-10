public class diagonalSum{
    public static int diaSum(int arr[][]){
        int pd=0; int sd=0;
        // for(int i=0;i<arr.length;i++){//O(n^2)
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             pd += arr[i][j];
        //         }
        //         if((i+j)==arr.length-1){//overlap element is not there
        //             sd+= arr[i][j];
        //         }
               
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            pd += arr[i][i];
            if(i != arr.length-i-1){//for  overlapping element
                sd += arr[i][arr.length-i-1];
            }
        }
        return pd+sd;
    }
    public static void main(String args []){
        int arr[][]= {  {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        System.out.println(diaSum(arr));
    }
}