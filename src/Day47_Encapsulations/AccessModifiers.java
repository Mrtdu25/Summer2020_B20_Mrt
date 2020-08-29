package Day47_Encapsulations;

public class AccessModifiers {

    //public
    public static int publicVariable=100;
    public static void publicMethods(){
        System.out.println("Public Method");
    }
    // default
    static int defaultVariable=200;
    static void defaultMethod(){
        System.out.println("default method");
    }

    //private

    private static int privateVariable=300;

    private static void privateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);  // public -we can call in main method because static
        System.out.println(defaultVariable);//default -we can call in main method because static
        System.out.println(privateVariable);//private -we can call in main method because static
    }


}
