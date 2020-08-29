package Library;
import Day47_Encapsulations.AccessModifiers;
public class Test_AccessModifiers {
    public static void main(String[] args) {
        // public
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethods();
        System.out.println("==========================");

        // We cant call default from Day47 because default can not be imported

        //System.out.println(AccessModifiers.defaultVariable);  compile error
        //AccessModifiers.defaultMethod compile error
        System.out.println("===============================");
        //Private
        // we can only use in the class not package and not other package
        // even if you import no possibility -impossible

        // AccessModifiers.privateVariable                 compile error
        // System.out.println(AccessModifiers.privateMethod);compile error

    }
}
