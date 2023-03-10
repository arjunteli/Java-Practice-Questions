public class clearLastIBits {
    public static int clearLastBits(int n, int i) {
        int BitMask = (-1)<<i;
        return n & BitMask;
    }
    public static void main(String args[]){
        System.out.print(clearLastBits(15, 2));
    }
}