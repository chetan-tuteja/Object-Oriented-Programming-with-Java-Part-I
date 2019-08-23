
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattAc = new Account("Matt's account", 1000.00);
        Account myAc = new Account("My account", 0.0);

        mattAc.withdrawal(100.0);
        myAc.deposit(100.0);

        System.out.println(mattAc);
        System.out.println(myAc);
    }

}
