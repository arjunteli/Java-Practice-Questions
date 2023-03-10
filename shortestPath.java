import java.util.*;
public class shortestPath{
    public static void displacement(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'W' ){
                x --;
            }
            else if(path.charAt(i) == 'E' ){
                x++;
            }
            else if(path.charAt(i) == 'N' ){
                y++;
            }
            else{
                y--;
            }
        }

        System.out.println( "Shortest path is "+ Math.sqrt((x*x + y*y)));
    }
    public static void main(String args []){
        String path = "WNEENESAENNNN";
        displacement(path);

    }
}