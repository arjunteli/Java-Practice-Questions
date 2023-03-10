public class setBit {
    public static int setIthBit(int n,int i) {
        int bitMast = 1<<i ;
        return n|bitMast;
    }
    public static void main(String args []) {
        System.out.print(setIthBit(10,2));
    }
}