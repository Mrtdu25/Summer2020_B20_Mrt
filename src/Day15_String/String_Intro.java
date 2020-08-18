package Day15_String;
import java.lang.String;
import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {

       // Scanner input=new Scanner(System.in);
        String name="Cybertek";
        String name2=new String("Cybertek");
        System.out.println(name2);

        String s1="Cat";//String Literal
        String s2="Cat";//String Literal

        System.out.println(s1==s2);//true Cat==Cat   Store in string pool nad doest create duplicate.

        String d1="Dog"; //String Literal
        String d2="dog";//String Literal
        System.out.println(d1==d2);//false  Dog!=dog

        //Another way to create String object.

        String t1=new String("Tiger"); // store in java heap it does create duplicate string.
        String t2=new String("Tiger");
        System.out.println(t1==t2);

        System.out.println("=================================================");

        String c1="Cybertek"; //String literal  store in string pool and does not accept duplicate
        String c2 = new String("Cybertek");// create in heap
        String c3 = new String("Cybertek");
        String c4="Cybertek";
        String c5="cybertek"; //different than "Cybertek"

        System.out.println(c1==c2); //false
        System.out.println(c3==c2);
        System.out.println(c1==c4);
        System.out.println(c4==c5); //false // "cybertek" different than "Cybertek"

        System.out.println("=======================");

        String str1="Java";
        str1="JavaScript";

        System.out.println(str1);

        str1 = "Java";

        System.out.println(str1);



    }
}
