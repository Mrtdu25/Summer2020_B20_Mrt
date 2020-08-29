package Day47_Encapsulations;

public class Test {
    public static void main(String[] args) {
     //public
    System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethods();

     //default we can call only if default is in the same package
     // outside the package even if you import no possibility

        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.publicMethods();

        //Private we can only use in the class not package and not other package
        // even if you import no possibility -impossible

       // AccessModifiers.privateVariable                 compile error
       // System.out.println(AccessModifiers.privateMethod);compile error

        System.out.println("=================================");

        Encapsulation obj1=new Encapsulation();
        System.out.println(obj1.getSsn());
        System.out.println(obj1.getUserName());
        System.out.println(obj1.getPassword());


       obj1.setSsn(14569874);
        System.out.println(obj1.getSsn());

        obj1.setUserName("hmf63");
        obj1.setPassword("123456");

        System.out.println(obj1.getUserName());
        System.out.println(obj1.getPassword());






    }
}
