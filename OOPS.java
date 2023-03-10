public class OOPS {
    public static void main(String[] args) {
        // Pen p1= new Pen() ;
        // p1.changeColor("blue");
        // System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "arjunTeli";
        System.out.println(myAcc.userName);
        myAcc.setPassword("abcdef");


    }
}
class Pen {
    int tip;
    String color ;

    void changeColor(String newColor) {
        color = newColor;
        
    }

    void changeTip(int newTip) {
        tip = newTip;
       
    }
}
class BankAccount {
    public String userName ;
    private String password ;
    public void setPassword(String newPwd ) {
        password = newPwd;
       // System.out.println(password);
    }

}
