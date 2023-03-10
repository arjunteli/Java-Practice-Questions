import javax.sound.midi.SysexMessage;

public class typePromotion{
    public static void main(String[] args) {
        // char a = 'c';
        // short b=1;
        // System.out.println(a+b);



        // int a=10;
        // float b= 20.34f;
        // long c= 23;
        // double d =20;
        // int ans =a+b+c+d;
        // System.out.println(ans);


        //wrong
        // byte b=5;
        // b=b*2;
        // System.out.println(b);
        



        //right
        byte b=5;
        b=(byte)(b*2);
        System.out.println(b);

    }
}