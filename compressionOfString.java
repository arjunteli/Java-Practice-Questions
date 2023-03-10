import java.util.*;
public class compressionOfString {
    public static String compressString(String str){
        StringBuilder str2 = new StringBuilder("");
        for(int i=0 ; i< str.length();i++){
            Integer count = 1;
            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)   ) {
                count ++ ;
                i++ ;
            }
            str2.append(str.charAt(i)) ;
            if(count>1){
                str2.append(count.toString()) ;
            }
        } 
        return str2.toString();
    }
    public static void main(String args []) {
        String str = "aaaabbbbdddd";
        System.out.println( "Compressed String is "+ compressString(str));

    }
}