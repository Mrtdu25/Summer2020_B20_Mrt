package Day06_ComparisonOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RelationalOperators {
    public static void main(String[] args) {

        //>
       boolean r1= 10>9;
        System.out.println(r1);

        //<
        boolean r2=100<99;
        System.out.println(r2);

        //>=

        boolean r3=87>=87;
        System.out.println(r3);

        boolean r4= 12>=13;
        System.out.println(r4);

        //<=

        boolean r5= 12<=2;
        System.out.println(r5);

        boolean r6 = 2<=12;
        System.out.println(r6);

        //=

        boolean r7= 300 == 300;
        System.out.println(r7);

        boolean r8= 1==7;
        System.out.println(r8);

        //!=

        boolean r9 = 1!=9;
        System.out.println(r9);

        boolean r10= "GS" != "FB";
        System.out.println(r10);

        // even & odd

        int number =100;
        boolean even = number%2==0;
        System.out.println(even);

        int odd =101;
        boolean odd1 = number%2!=0;
        System.out.println(odd1);



        int x =1000;
        System.out.println(x%3);
        System.out.println(x%5);
        System.out.println(x%10);


    }


}
