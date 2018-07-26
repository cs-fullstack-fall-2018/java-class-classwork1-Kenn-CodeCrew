public class Ex31 {
    public static void main(String[] args) {
        Account myAccount = new Account("Jordan", 100);
        myAccount.deposit(20);
        System.out.print(myAccount.balance());
    }
}
