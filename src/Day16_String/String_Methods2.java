package Day16_String;

import javax.jws.soap.SOAPBinding;
import java.util.SortedMap;

public class String_Methods2 {
    public static void main(String[] args) {

        String name1="Cybertek";
        System.out.println(name1.isEmpty());

        String name2="";
        System.out.println(name2.isEmpty());

        String str1 = "Java";  // String pool
        String str2 = new String("Java"); // heap

        System.out.println(str1+" : "+str2);
        System.out.println( str1 == str2 ); // false

        System.out.println( str1.equals(str2)  );

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); // false
        System.out.println( str3.equals(str4) );  // true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println( str5 == str6 ); // true
        System.out.println(str5.equals(str6)) ;// true

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7.equals(str8) ); // FALSE
        System.out.println( str7.equalsIgnoreCase(str8) ); // true

        // YES, Yes, yes, yEs  ==> yes

        //contains
        String str =" I like to learn java programming";
        System.out.println(str.contains("pyphon"));//false
        System.out.println(!str.contains("pyphon"));//true
        System.out.println(str.contains("java")); //True
        System.out.println(str.contains("JAVA"));// False


        //StarstWith

        String s1="Murat";

        System.out.println(s1.startsWith("M")); //True
        System.out.println(s1.startsWith("H")); //False
        System.out.println(s1.startsWith("Mu"));//True
        System.out.println(s1.startsWith("Ha"));//False

        //endEwith

        String s2="Duaa";

        System.out.println(s2.endsWith("t"));
        System.out.println(s2.endsWith("a"));
        System.out.println(s2.endsWith("uaa"));






    }
}
