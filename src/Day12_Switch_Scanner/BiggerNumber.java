package Day12_Switch_Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class BiggerNumber {
    public static void main(String[] args) {
       //Murat's way
        double n1=8;
        double n2=17;
        double n3=-6;

      /*  if(n2>n1 && n2>n3){
            System.out.println("n2 is bigger");
        }else if(n1>n3 && n1>n2){
            System.out.println("n1 is bigger");
        }else
            System.out.println("n3 is bigger");
*/
        boolean n1IsBigger=n1>n2 && n1>n3;
        boolean n2IsBigger=n2>n1 && n2>n3;
        Boolean n3IsBigger=!n1IsBigger&& !n2IsBigger;
        String result=(n2IsBigger)? "n2 is bigger":(n1IsBigger)?"n1 is bigger":"n3 is bigger";
        System.out.println(result);
        System.out.println("===============================");
 //Muhtar's way











    }
}
