package Day04_Variables;

// We will practice Boolean & Char
// boolean result only can be True & False

import Day35_ArrayList.ArrayList_Methods;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Variables {
    public static void main(String[] args) {
    boolean result1 = true;
    boolean result2 =false;

        System.out.println(result1);
        System.out.println(result2);

//// > , <
        boolean result3= 10 > 6000;
        System.out.println(result3);

        //

        int a =300;
        int b =45;

        boolean result4 =b < a ;
        System.out.println(result4);

        // new exp

        int c =1451;
        int d =1071;

        boolean result5= c >d;
        boolean result6= d >c;
        System.out.println(result5);
        System.out.println(result6);

        String daug="Aya sophia Degirmenci";
        String son= "Abdulhamid Degirmenci";

        int daugLength = daug.length();
        int sonLength = son.length();

        System.out.println(daugLength==sonLength);



        // Elvis > Micheal










    }



}
