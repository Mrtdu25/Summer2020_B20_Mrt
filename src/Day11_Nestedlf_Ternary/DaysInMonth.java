package Day11_Nestedlf_Ternary;
/*
2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */

public class DaysInMonth {
    public static void main(String[] args) {

        int month=8;

        String result="";

        if (month==2){
            result="28 days";
        }else if (month== 4||month==6||month==9||month==11){
            result="30 days";
        }else if (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12) {
            result = "31 days";
        }else
            result="Invalid";

        System.out.println(result);

        /// Second way

        int Month =6;

        boolean Days28= Month ==2;

        boolean Days30= Month== 4||Month==6||Month==9||Month==11 ;

        boolean invalid = Month <1 || month >12;

        String r1="";

        if (Days28){
            r1="28 days";
        }else if (Days30){
            r1="30 days";
        }else if (invalid){
            r1="invalid";
        }else
            r1="31 days";

        System.out.println(r1);

    }
}
