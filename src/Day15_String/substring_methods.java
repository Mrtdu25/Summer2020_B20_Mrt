package Day15_String;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class substring_methods {
    public static void main(String[] args) {

        String sentence="Java is fun";
        //               012345789..

        //substring(beg index, end index)
        String word =sentence.substring(0,4);
        System.out.println(word);

        String word2=sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("===============================");

        String sentence2="I like Movies and Tv Series";


        String world3=sentence2.substring(7,13);
        System.out.println(world3);

        System.out.println("==================================");

        String firstName="cybertekSCHool";
        String firtsCharacter=firstName.substring(0,1);
        String rest=firstName.substring(1,firstName.length()); // last index +1
        firstName=firtsCharacter.toUpperCase()+rest.toLowerCase();

        System.out.println(firtsCharacter);
        System.out.println(rest);
        System.out.println(firstName);

        System.out.println("=================================");
        String lastName="sCHool";
        String firstChar=lastName.substring(0,1); //
        String remaining=lastName.substring(1);
        lastName=firstChar.toUpperCase()+remaining.toLowerCase();

        System.out.println(firstChar);
        System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("==================================");

        String s="I like Game Of Thrones";
              //  012345678
        String series=s.substring(7);

        System.out.println(series);


        String s2="i like Java Programming Language";
        String language=s2.substring(7);
        System.out.println(language);



    }
}
