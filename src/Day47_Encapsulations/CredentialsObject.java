package Day47_Encapsulations;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials obj1=new Credentials("Murat",31);

        System.out.println(obj1+"\nCompanyName: "+Credentials.companyName+"\nUsername: "+obj1.getUsername()+"\nPassword: "+obj1.getPassword());
        System.out.println("====================");
        obj1.setUsername("HmD2525");
        obj1.setPassword("2525HmD");

        System.out.println(obj1+"\nCompanyName: "+Credentials.companyName+"\nUsername: "+obj1.getUsername()+"\nPassword: "+obj1.getPassword());





    }
}
