package Day08_LogicalOperators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice3 {
    public static void main(String[] args) {

        // Task1
        int b=2;
        boolean res= ++b==2 ||--b ==2 && --b==2; // false because b became 3
        //             3==2 || 2 ==2   && 1== 2
        //             false|| true && false
        //       Result=  false || true // result is true bc we have one true result

        System.out.println(res);
        System.out.println(b);

        System.out.println("================================");

        //Task2
        int c =5;
        boolean r2= c++==6 || c-- ==5;
        //      r2= 5  ==6 || 6   ==5;
        //        false    || false
           //Result : false
        System.out.println(r2);

        System.out.println("===================================");


        //task3

        boolean A =true;
        Boolean B= !A;

        boolean C = A !=B && A==!B && !A==B;
        //      True !=false && true==true && false==false
        //          true     && true        && true2
        System.out.println(C);




    }
}
