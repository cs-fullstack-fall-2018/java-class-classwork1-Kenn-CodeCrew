public class Ex32 {
    public static void main(String[] args) {
        Account MattsAccount = new Account("Matt's Account", 1000);
        Account Myaccount = new Account("My Account", 0);
        MattsAccount.withdrawal(100);
        Myaccount.deposit(100);
        System.out.println(MattsAccount);
        System.out.println(Myaccount);

    }
}
