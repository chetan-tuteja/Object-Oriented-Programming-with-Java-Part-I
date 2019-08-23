
public class Main {

    public static void main(String[] args) {
        // write test code here
        LyyraCard test = new LyyraCard(10);
        System.out.println("Bal: "+test.balance());
        Boolean eg = test.pay(8);
        System.out.println("Bal: "+test.balance()+" Pay: "+eg);
       eg= test.pay(4);
        System.out.println("Bal: "+test.balance()+" Pay: "+eg);
       
    }
}

