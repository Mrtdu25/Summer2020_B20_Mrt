package Office_Hours.Practice_06_17_2020;

import javax.jws.soap.SOAPBinding;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean r1=!true !=true;
                // false!=true==>True
        System.out.println(r1);

        boolean r2=!r1; // ==false
        System.out.println(r2);

        System.out.println("====================================");

        //         || : or means either one

        boolean result1=9>10 || "Java"== "Java" || "A"=="a";
               //       false ||     true       || false ==>  true   one true is enough
        System.out.println(result1);

        System.out.println("=====================================");

        // && and logic

        boolean result2= "Java" != "Pyton" &&  "Muhtar"== "Good Guy";
                      //  true             &&   false  = false
        System.out.println(result2);















    }
}
