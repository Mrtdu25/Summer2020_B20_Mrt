package Day48_Inheritance;
/*WarmUp tasks:
    create custom class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance*/
public class BankAccount {
    public String firstName;
    public String lastName;

    BankAccount(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static String bankName; // static bc its common info

    static {
        bankName="Bank of America";
    }

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        System.out.println("Depositing... $"+depositAmount);
        balance+=depositAmount;
    }

    public void withdraw(double withdrawAmount){

        if (withdrawAmount>balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing...$"+withdrawAmount);
        balance-=withdrawAmount;
    }
    public void availableBalance(){
        System.out.println("Available Balance...$"+getBalance());
    }



    public String toString(){
        return bankName +
                "\n==================================================="+
                "\n"+getAccountHolder()+
                "\nAccount Number: "+getAccountNumber()+
                "\n==================================================="+
                "\nBalance: $"+getBalance();
    }




}
