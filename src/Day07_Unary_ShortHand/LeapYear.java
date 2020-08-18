package Day07_Unary_ShortHand;
/*Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisible by 4 is leap year


 */

import sun.applet.Main;

public class LeapYear {
    public static void main(String[] args) {

        int year =2040;
        boolean result=year %4 ==0;
        System.out.println(year+" is a leap year ; "+result);

        System.out.println("===============================");

        /* year2 =1453 = int;
          lYEAR= true / false

       assume tht divisible number is 6

         */

        int year2=1453;

        boolean lYear=1453%5==0;
        boolean myear=1453%5!=0;
        boolean kyear=1453%5<10;

        System.out.println(lYear);
        System.out.println(myear);
        System.out.println(kyear);








    }



}
