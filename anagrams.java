import java.lang.reflect.Array;
import java.util.* ;
public class anagrams {
    public static void anagrams( String str, String str2){
        //for the final output storing values
        String first = str;
        String Second = str2;

        // First check - if the lengths are the same
        if(str.length()==str2.length()) {

            //Convert Strings to lowercase. Why? so tha twe don't have to checkseparately for lower & uppercase.
            str = str.toLowerCase();
            str2 = str2.toLowerCase();

            // convert strings into char array
            char strArray [] = str.toCharArray();
            char str2Array [] = str2.toCharArray();

            // sort the char array
            Arrays.sort(strArray);
            Arrays.sort(str2Array);

            // if the sorted char arrays are same or identical then the strings area nagram
            boolean bl = Arrays.equals(strArray,str2Array);
            if(bl) {
                System.out.println(first +" and "+ Second +  " are anagram.");
            }
            else {
                System.out.println(first +" and "+Second+ " are not anagram.");
            }
        }
        // case when lengths are not equal


















































        
        else {
            System.out.println(first +" and "+Second+ " are not anagram.");
        }
        

    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter str : ");
        String str = sc.next();
        System.out.print("Enter str2 : ");
        String str2 = sc.next();
        anagrams(str, str2);
    }
}