package Day34_WrapperClasses;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        int a1 = Integer.MIN_VALUE;
        System.out.println(a);
        System.out.println(a1);

        System.out.println("=======================");

        byte b = Byte.MAX_VALUE;
        byte b1 = Byte.MIN_VALUE;
        System.out.println(b);
        System.out.println(b1);

        long l=Long.MAX_VALUE;
        long l1= Long.MIN_VALUE;
        System.out.println("Max long:"+l+" Min long: "+l1);

        System.out.println("==========================");

        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int n=scan.nextInt();

            if (n>max){
                max=n;
            }

            if (n<min){
               min=n;
            }
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);




    }
}