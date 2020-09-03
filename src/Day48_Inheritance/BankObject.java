package Day48_Inheritance;

public class BankObject {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount("Murat","Degirmenci");


        account1.setAccountHolder(account1.firstName+" "+account1.lastName);
        account1.setAccountNumber(145310711905L);
        account1.setBalance(999_999);

        account1.availableBalance();

        System.out.println(account1);

        account1.deposit(15750);
        account1.availableBalance();
        account1.withdraw(575000);
        account1.availableBalance();






    }
}
